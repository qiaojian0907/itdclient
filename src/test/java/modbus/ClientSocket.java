package modbus;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientSocket {

    public static void main(String[] args)throws Exception{
        new ClientSocket();
    }

    public ClientSocket() throws Exception{
        Socket socket=null;

        try {
            //建立与服务器连接的socket
            socket=new Socket("127.0.0.1", 8090);

            //写数据到服务端:建立写数据流,往流写数据
            String strVal="客户端送来慰问: 服务端你好!";
            OutputStream os=socket.getOutputStream();
            os.write(strVal.getBytes());

            //写关闭,不然会影响读:不然会一直阻塞着,服务器会认为客户端还一直在写数据
            //由于从客户端发送的消息长度是任意的，客户端需要关闭连接以通知服务器消息发送完毕，如果客户端在发送完最后一个字节后
            //关闭输出流，此时服务端将知道"我已经读到了客户端发送过来的数据的末尾了,即-1",就会读取出数据并关闭服务端的读数据流,在之后就可以
            //自己(服务端)的输出流了,往客户端写数据了
            socket.shutdownOutput();

            InputStream is=socket.getInputStream();
            byte[] bytes=new byte[1024];
            int len;
            while((len=is.read(bytes))!=-1){
                System.out.println(new String(bytes,0,len));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            socket.close();
        }
    }

}
