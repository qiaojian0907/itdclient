package com.omt.HttpClient;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClientUtil {
    /**
     * 默认超时时间1分钟
     */
    private static final int DEFAULT_TIMEOUT_MINUTES = 1;

    /**
     * GET请求方法
     */
    private static final String METHOD_TYPE_GET = "GET";

    /**
     * POST请求方法
     */
    private static final String METHOD_TYPE_POST = "POST";

    /**
     * form表单数据类型
     */
    private static final String CONTENT_TYPE_FORM = "application/x-www-form-urlencoded";

    /**
     * xml报文数据类型
     */
    private static final String CONTENT_TYPE_XML = "text/xml";

    /**
     * json数据类型
     */
    private static final String CONTENT_TYPE_JSON = "application/json";

    /**
     * 默认字符集UTF-8
     */
    private static final String DEFAULT_CHARSET = "UTF-8";

    /**
     * 执行GET方式表单请求
     *
     * @param url
     * @param msg
     * @return
     * @throws IOException
     */
    public static String doGet(String url, String msg) throws IOException {
        return doSend(url, msg, METHOD_TYPE_GET, CONTENT_TYPE_FORM, DEFAULT_CHARSET, DEFAULT_TIMEOUT_MINUTES);
    }

    /**
     * 执行GET方式表单请求
     *
     * @param url
     * @param msg
     * @param charset
     * @return
     * @throws IOException
     */
    public static String doGet(String url, String msg, String charset) throws IOException {
        return doSend(url, msg, METHOD_TYPE_GET, CONTENT_TYPE_FORM, charset, DEFAULT_TIMEOUT_MINUTES);
    }

    /**
     * 执行GET方式表单请求
     *
     * @param url
     * @param msg
     * @param timeoutMinutes
     * @return
     * @throws IOException
     */
    public static String doGet(String url, String msg, int timeoutMinutes) throws IOException {
        return doSend(url, msg, METHOD_TYPE_GET, CONTENT_TYPE_FORM, DEFAULT_CHARSET, timeoutMinutes);
    }

    /**
     * 执行GET方式表单请求
     *
     * @param url
     * @param msg
     * @param charset
     * @param timeoutMinutes
     * @return
     * @throws IOException
     */
    public static String doGet(String url, String msg, String charset, int timeoutMinutes) throws IOException {
        return doSend(url, msg, METHOD_TYPE_GET, CONTENT_TYPE_FORM, charset, timeoutMinutes);
    }

    /**
     * 执行POST方式表单请求
     *
     * @param url
     * @param msg
     * @return
     * @throws IOException
     */
    public static String doPost(String url, String msg) throws IOException {
        return doSend(url, msg, METHOD_TYPE_POST, CONTENT_TYPE_FORM, DEFAULT_CHARSET, DEFAULT_TIMEOUT_MINUTES);
    }

    /**
     * 执行POST方式表单请求
     *
     * @param url
     * @param msg
     * @param charset
     * @return
     * @throws IOException
     */
    public static String doPost(String url, String msg, String charset) throws IOException {
        return doSend(url, msg, METHOD_TYPE_POST, CONTENT_TYPE_FORM, charset, DEFAULT_TIMEOUT_MINUTES);
    }

    /**
     * 执行POST方式表单请求
     *
     * @param url
     * @param msg
     * @param timeoutMinutes
     * @return
     * @throws IOException
     */
    public static String doPost(String url, String msg, int timeoutMinutes) throws IOException {
        return doSend(url, msg, METHOD_TYPE_POST, CONTENT_TYPE_FORM, DEFAULT_CHARSET, timeoutMinutes);
    }

    /**
     * 执行POST方式表单请求
     *
     * @param url
     * @param msg
     * @param charset
     * @param timeoutMinutes
     * @return
     * @throws IOException
     */
    public static String doPost(String url, String msg, String charset, int timeoutMinutes) throws IOException {
        return doSend(url, msg, METHOD_TYPE_POST, CONTENT_TYPE_FORM, charset, timeoutMinutes);
    }

    /**
     * 执行POST方式报文请求
     *
     * @param url
     * @param msg
     * @return
     * @throws IOException
     */
    public static String doPostXml(String url, String msg) throws IOException {
        return doSend(url, msg, METHOD_TYPE_POST, CONTENT_TYPE_XML, DEFAULT_CHARSET, DEFAULT_TIMEOUT_MINUTES);
    }

    /**
     * 执行POST方式报文请求
     *
     * @param url
     * @param msg
     * @param charset
     * @return
     * @throws IOException
     */
    public static String doPostXml(String url, String msg, String charset) throws IOException {
        return doSend(url, msg, METHOD_TYPE_POST, CONTENT_TYPE_XML, charset, DEFAULT_TIMEOUT_MINUTES);
    }

    /**
     * 执行POST方式报文请求
     *
     * @param url
     * @param msg
     * @param timeoutMinutes
     * @return
     * @throws IOException
     */
    public static String doPostXml(String url, String msg, int timeoutMinutes) throws IOException {
        return doSend(url, msg, METHOD_TYPE_POST, CONTENT_TYPE_XML, DEFAULT_CHARSET, timeoutMinutes);
    }

    /**
     * 执行POST方式报文请求
     *
     * @param url
     * @param msg
     * @param charset
     * @param timeoutMinutes
     * @return
     * @throws IOException
     */
    public static String doPostXml(String url, String msg, String charset, int timeoutMinutes) throws IOException {
        return doSend(url, msg, METHOD_TYPE_POST, CONTENT_TYPE_XML, charset, timeoutMinutes);
    }

    /**
     * 发送请求并返回响应消息
     *
     * @param url
     * @param msg
     * @param methodType
     * @param contentType
     * @param charset
     * @param timeoutMinutes
     * @return
     * @throws IOException
     */
    private static String doSend(String url, String msg, String methodType, String contentType, String charset,
                                 int timeoutMinutes) throws IOException {

        HttpURLConnection conn = null;
        try {
            if (METHOD_TYPE_GET.equalsIgnoreCase(methodType)) {
                url += '?' + msg;
            }

            conn = getConnection(url, methodType, contentType, charset, timeoutMinutes);

            if (METHOD_TYPE_POST.equalsIgnoreCase(methodType)) {
                write(conn, charset, msg);
            }

            return read(conn, charset);
        }
        finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
    }

    /**
     * 将消息读入
     *
     * @param conn
     * @param charset
     * @return
     * @throws IOException
     */
    private static String read(HttpURLConnection conn, String charset) throws IOException {

        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), charset));
            String t = null;
            StringBuilder sb = new StringBuilder();
            while ((t = in.readLine()) != null) {
                sb.append(t).append("\n");
            }
            return sb.toString().trim();
        }
        finally {
            if (in != null) {
                in.close();
            }
        }
    }

    /**
     * 将消息写出
     *
     * @param conn
     * @param charset
     * @param msg
     * @throws IOException
     */
    private static void write(HttpURLConnection conn, String charset, String msg) throws IOException {

        PrintWriter out = null;
        try {
            out = new PrintWriter(new OutputStreamWriter(conn.getOutputStream(), charset));
            out.print(msg);
        }
        finally {
            if (out != null) {
                out.close();
            }
        }
    }

    /**
     * 创建一个http连接
     *
     * @param url
     * @param methodType
     * @param contentType
     * @param charset
     * @param timeoutMinutes
     * @return
     * @throws IOException
     */
    private static HttpURLConnection getConnection(String url, String methodType, String contentType, String charset,
                                                   int timeoutMinutes) throws IOException {

        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setUseCaches(false);
        int timeout = timeoutMinutes * 60 * 1000;
        conn.setConnectTimeout(timeout);
        conn.setReadTimeout(timeout);
        conn.setRequestMethod(methodType);
        conn.setRequestProperty("Content-Type", contentType + ";charset=" + charset);

        return conn;
    }

    public static String doPostJson(String url, String jsonStr) throws IOException {
        return doSend1(url, jsonStr, METHOD_TYPE_POST, CONTENT_TYPE_JSON, DEFAULT_CHARSET, DEFAULT_TIMEOUT_MINUTES);
    }

    private static String doSend1(String url, String msg, String methodType, String contentType, String charset, int timeoutMinutes) throws IOException {
        //msg = URLEncoder.encode(msg, "UTF-8");
        System.out.println("URL ------"+url);
        System.out.println("doSend 写出---"+msg);

        HttpURLConnection conn = null;
        try {
            if (METHOD_TYPE_GET.equalsIgnoreCase(methodType)) {
                url += '?' + msg;
            }

            conn = getConnection(url, methodType, contentType, charset, timeoutMinutes);
            System.out.println("连接"+conn);
            if (METHOD_TYPE_POST.equalsIgnoreCase(methodType)) {
                write(conn, charset, msg);
            }

            //return read(conn, charset);
            String msg1 = read(conn, charset);
            //System.out.println(msg1);
            System.out.println("返回结果 ---------------------"+msg1);
            return msg1;
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
    }

    /**
     * 客户端读取请求内容
     * readRequest
     * @param request
     * @return
     * @throws IOException
     * @return String
     * @Exception
     */
    public static String readRequest(HttpServletRequest request)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(), "utf-8"));
        String line = null;
        StringBuilder sb = new StringBuilder();
        while((line=br.readLine())!=null){
            sb.append(line);
        }
        return sb.toString();
    }

    /**
     * 获取request
     * @return
     */
    public static HttpServletRequest getRequest(){
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = ((ServletRequestAttributes)ra).getRequest();
        return request;
    }

}
