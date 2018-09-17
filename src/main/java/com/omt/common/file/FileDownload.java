package com.omt.common.file;

import org.apache.tools.zip.ZipEntry;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipOutputStream;

/**
 * Created by wangbl on 2018/3/25.
 */
public class FileDownload {
    public void downloadFile(HttpServletResponse response,String path,String fileName) throws IOException {

       /* //获取文件根目录，不同框架获取的方式不一样，可自由切换
        String basePath = request.getSession().getServletContext().getRealPath("/upload/text");

        //获取文件名称（包括文件格式）
        String fileName = request.getParameter("downFileName");

        //组合成完整的文件路径
        String targetPath = basePath+File.separator+fileName;

        //模拟多一个文件，用于测试多文件批量下载
        String targetPath1 = basePath+File.separator+"ggg.jpg";
        System.out.println("文件名："+fileName);
        System.out.println("文件路径："+targetPath);*/

        //方法1：IO流实现下载的功能
        HttpServletResponse res = response; //创建response回应
        res.setContentType("text/html; charset=UTF-8"); //设置编码字符
        res.setContentType("application/x-msdownload"); //设置内容类型为下载类型
        res.setHeader("Content-disposition", "attachment;filename="+ java.net.URLEncoder.encode(fileName+".zip","UTF-8"));//设置下载的文件名称
        OutputStream out = res.getOutputStream();   //创建页面返回方式为输出流，会自动弹出下载框
/*  //方法1-1：IO字节流下载，用于小文件
    System.out.println("字节流下载");
    InputStream is = new FileInputStream(targetPath);  //创建文件输入流
    byte[] Buffer = new byte[2048];  //设置每次读取数据大小，即缓存大小
    int size = 0;  //用于计算缓存数据是否已经读取完毕，如果数据已经读取完了，则会返回-1
    while((size=is.read(Buffer)) != -1){  //循环读取数据，如果数据读取完毕则返回-1
        out.write(Buffer, 0, size); //将每次读取到的数据写入客户端
    }
*/

/*  //方法1-2：IO字符流下载，用于大文件
    System.out.println("字符流");
    File file = new File(targetPath);  //创建文件
    FileInputStream fis=new FileInputStream(targetPath);  //创建文件字节输入流
    BufferedInputStream buff=new BufferedInputStream(fis); //创建文件缓冲输入流
    byte [] b=new byte[2048];  //设置每次读取大小
    long l=0;  //用于判断是否等同于文件的长度，即文件下载大小
    while(l<file.length()){  //循环读取文件
        int j=buff.read(b,0,2048); //使用缓冲流读取数据,返回缓冲区长度
        l+=j;
        out.write(b,0,j);//将缓存写入客户端
    }
*/

  //方法1-3：将附件中多个文件进行压缩，批量打包下载文件
    //创建压缩文件需要的空的zip包
    //String zipBasePath=request.getSession().getServletContext().getRealPath("/upload/zip/");
    String zipFilePath = "/Volumes/data/ideaProjects/ar/upload-dir/20180324101228112/temp.zip";

    //创建文件路径的集合，
    List<String> filePath = new ArrayList<String>();
    filePath.add("/Volumes/data/ideaProjects/ar/upload-dir/"+path);
    //filePath.add(targetPath1);

    //根据临时的zip压缩包路径，创建zip文件
    File zip = new File(zipFilePath);
    if (!zip.exists()){
        zip.createNewFile();
    }

    //创建zip文件输出流
    FileOutputStream fos = new FileOutputStream(zip);
    ZipOutputStream zos = new ZipOutputStream(fos);
    /*//循环读取文件路径集合，获取每一个文件的路径
    for(String fp : filePath){
        System.out.println("文件路径="+fp);
        File f = new File(fp);  //根据文件路径创建文件
        zipFile(f, zos);  //将每一个文件写入zip文件包内，即进行打包
    }
    //

        fos.close();
        zos.close();*/
        compressedFile("/Volumes/data/ideaProjects/ar/upload-dir/"+path, "/Volumes/data/ideaProjects/ar/upload-dir/20180324101228112");
    //将打包后的文件写到客户端，输出的方法同上，使用缓冲流输出
    InputStream fis = new BufferedInputStream(new FileInputStream("/Volumes/data/ideaProjects/ar/upload-dir/20180324101228112/homework.zip"));
    byte[] buff = new byte[4096];
    int size = 0;
    while((size=fis.read(buff)) != -1){
        out.write(buff, 0, size);
    }


        //释放和关闭输入输出流
        //out.flush();
        //out.close();
        //fis.close();
        //buff.close();
        //is.close();
    }

    //封装压缩文件的方法
    public  void zipFile(File inputFile,ZipOutputStream zipoutputStream) {

        try {
            if(inputFile.exists()) { //判断文件是否存在
                if (inputFile.isFile()) {  //判断是否属于文件，还是文件夹
                    System.out.println("是文件--------文件名称="+inputFile.getName());
                    //创建输入流读取文件
                    FileInputStream fis = new FileInputStream(inputFile);
                    BufferedInputStream bis = new BufferedInputStream(fis);

                    //将文件写入zip内，即将文件进行打包
                    ZipEntry ze = new ZipEntry(inputFile.getName()); //获取文件名
                    zipoutputStream.putNextEntry(ze);

                    //写入文件的方法，同上
                    byte [] b=new byte[1024];
                    long l=0;
                    while(l<inputFile.length()){
                        int j=bis.read(b,0,1024);
                        l+=j;
                        zipoutputStream.write(b,0,j);
                    }
                    //关闭输入输出流
                    bis.close();
                    fis.close();
                } else {  //如果是文件夹，则使用穷举的方法获取文件，写入zip

                    try {
                        File[] files = inputFile.listFiles();
                        System.out.println("是文件夹--------文件数量="+files.length);
                        for (int i = 0; i < files.length; i++) {
                            System.out.println("文件夹中文件名称="+files[i].getName());
                            zipFile(files[i], zipoutputStream);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * @desc 将源文件/文件夹生成指定格式的压缩文件,格式zip
     * @param resourePath 源文件/文件夹
     * @param targetPath  目的压缩文件保存路径
     * @return void
     * @throws Exception
     */
    public void compressedFile(String resourcesPath,String targetPath) throws IOException{
        File resourcesFile = new File(resourcesPath);     //源文件
        File targetFile = new File(targetPath);           //目的
        //如果目的路径不存在，则新建
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }

        String targetName = resourcesFile.getName()+".zip";   //目的压缩文件名
        FileOutputStream outputStream = new FileOutputStream(targetPath+"//"+targetName);
        ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(outputStream));

        createCompressedFile(out, resourcesFile, "");

        out.close();
    }

    /**
     * @desc 生成压缩文件。
     * 	             如果是文件夹，则使用递归，进行文件遍历、压缩
     *       如果是文件，直接压缩
     * @param out  输出流
     * @param file  目标文件
     * @return void
     * @throws Exception
     */
    public void createCompressedFile(ZipOutputStream out,File file,String dir) throws IOException{
        //如果当前的是文件夹，则进行进一步处理
        if(file.isDirectory()){
            //得到文件列表信息
            File[] files = file.listFiles();
            //将文件夹添加到下一级打包目录
            out.putNextEntry(new ZipEntry(dir+"/"));

            dir = dir.length() == 0 ? "" : dir +"/";

            //循环将文件夹中的文件打包
            for(int i = 0 ; i < files.length ; i++){
                createCompressedFile(out, files[i], dir + files[i].getName());         //递归处理
            }
        }
        else{   //当前的是文件，打包处理
            //文件输入流
            FileInputStream fis = new FileInputStream(file);

            out.putNextEntry(new ZipEntry(dir));
            //进行写操作
            int j =  0;
            byte[] buffer = new byte[1024];
            while((j = fis.read(buffer)) > 0){
                out.write(buffer,0,j);
            }
            //关闭输入流
            fis.close();
        }
    }

    /*public static void main(String args[]){
        FileDownload s=new FileDownload();
        try {
            s.compressedFile("/Volumes/data/ideaProjects/ar/upload-dir/20180324101228112/homework", "/Volumes/data/ideaProjects/ar/upload-dir/20180324101228112");
            System.out.println("压缩文件已经生成...");
        } catch (Exception e) {
            System.out.println("压缩文件生成失败...");
            e.printStackTrace();
        }
        try {

            //s.downloadFile("/Volumes/data/ideaProjects/ar/upload-dir/20180324101228112/homework", "test");
        }catch (Exception e){
            e.printStackTrace();
        }
    }*/
}
