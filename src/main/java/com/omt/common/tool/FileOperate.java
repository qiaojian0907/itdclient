package com.omt.common.tool;

import java.io.*;

/**
 * Created by wangbl on 2017/12/18.
 */
public class FileOperate {
    public void WriteStringToFile(String filePath,String content) {
        try {
            File file = new File(filePath);
            PrintStream ps = new PrintStream(new FileOutputStream(file));
            ps.println(content);// 往文件里写入字符串
            //ps.append("http://www.jb51.net");// 在已有的基础上添加字符串
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void WriteStringToFileA(String filePath,String content) {
        try {
            FileWriter fw = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(content);
            //bw.write("abc\r\n ");// 往已有的文件上添加字符串
            //bw.write("def\r\n ");
            //bw.write("hijk ");
            bw.close();
            fw.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void WriteStringToFileB(String filePath,String content) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(filePath));
            pw.println(content);
            //pw.println("def ");
            //pw.println("hef ");
            pw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void WriteStringToFileC(String filePath,String content) {
        try {
            RandomAccessFile rf = new RandomAccessFile(filePath, "rw");
            rf.writeBytes(content);
            //rf.writeBytes("app\r\n");
            //rf.writeBytes("hijklllll");
            rf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void WriteStringToFileD(String filePath,String content) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            fos.write(content.getBytes());
            fos.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /*public static void main(String[] args) {
        String filePath = "E:\\link.txt";
        new FileOperate().WriteStringToFileD(filePath,"test");
    }*/
}
