package modbus;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocket {

    public static void main(String[] args)throws Exception{
        new MyServerSocket();
    }


    public MyServerSocket() throws Exception {
        ServerSocket serverSocket=null;
        Socket socket=null;

        try {
            serverSocket=new ServerSocket(8090);
            socket=serverSocket.accept();
            InputStream is=socket.getInputStream();

            byte[] bytes=new byte[1024];
            int len;
            while((len=is.read(bytes))!=-1){
                System.out.println(new String(bytes, 0, len));
            }

            String strVal="服务端发来慰问: 客户端你好!";
            OutputStream os=socket.getOutputStream();
            os.write(strVal.getBytes());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally{
            socket.close();
            serverSocket.close();

        }
    }

}
