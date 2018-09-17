package com.omt.common.poi;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangbl on 2017/12/22.
 */
public class ExcelUtil {
    /*public static void main(String[] args) {
        String filePath="/Volumes/data/stencil.xlsx";
        List<List<String>>  data=importExecl(filePath);
        System.out.println(data);
    }*/


    /**
     * excel表的导入功能
     * @作者：我
     * @return List<List<String>> 行(列(,,,,,))
     */
    public static List<List<String>> importExcel(MultipartFile excelFile){
        List<List<String>> data=new ArrayList<List<String>>();
        //File file=new File(filePath);
        //System.out.println(file);
        //判断文件是否存在或者后缀名是否正确,否则返回为null
        if(!(isExcel2003(excelFile.getOriginalFilename().toLowerCase()) ||
                isExcel2007(excelFile.getOriginalFilename().toLowerCase()))){
            return null;
        }
        //判断文件的版本2003或者2007版
        InputStream is = null;
        //得到Excel工作簿对象
        Workbook wb = null;
        boolean isExcel2003 = true;
        if(isExcel2007(excelFile.getOriginalFilename().toLowerCase())){
            isExcel2003 = false;
        }
        try {
            is =excelFile.getInputStream();
            if(isExcel2003){
                System.out.println("本表是2003版的excel表");
                wb = new HSSFWorkbook(is);
            }else{
                System.out.println("本表是2007版的excel表");
                wb=new XSSFWorkbook(is);
            }
            //得到Excel工作表对象
            //得到第一个shell
            Sheet sheet = wb.getSheetAt(0);
            //得到所有行数
            int totalRows=sheet.getPhysicalNumberOfRows();
            // 得到Excel的列数
            int totalCells=0;
            if (totalRows >= 1 && sheet.getRow(0) != null){
                totalCells = sheet.getRow(0).getPhysicalNumberOfCells();
            }
            //循环行
            for(int rowNum=0;rowNum<totalRows;rowNum++){
                Row row = sheet.getRow(rowNum);
                if(row==null){
                    continue;
                }
                //存放本行中的所列的数据
                List<String> rowLst = new ArrayList<String>();
                //循环列
                for(int column=0;column<totalCells;column++){
                    Cell cell = row.getCell(column);
                    String cellValue = "";
                    if(null!=cell){
                        //以下是判断数据的类型
                        switch (cell.getCellType()) {
                            case HSSFCell.CELL_TYPE_NUMERIC: // 数字
                                if (HSSFDateUtil.isCellDateFormatted(cell)) {
                                    // 处理日期格式、时间格式
                                    SimpleDateFormat sdf = null;
                                    if (cell.getCellStyle().getDataFormat() == HSSFDataFormat
                                            .getBuiltinFormat("h:mm")) {
                                        sdf = new SimpleDateFormat("HH:mm");
                                    } else {// 日期
                                        sdf = new SimpleDateFormat("yyyy-MM-dd");
                                    }
                                    java.util.Date date =cell.getDateCellValue();
                                    cellValue = sdf.format(date);
                                } else if (cell.getCellStyle().getDataFormat() == 58) {
                                    // 处理自定义日期格式：m月d日(通过判断单元格的格式id解决，id的值是58)
                                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                                    double value = cell.getNumericCellValue();
                                    java.util.Date date =org.apache.poi.ss.usermodel.DateUtil
                                            .getJavaDate(value);
                                    cellValue = sdf.format(date);
                                } else {
                                    //存数字格式
                                    double value = cell.getNumericCellValue();
                                    CellStyle style = cell.getCellStyle();
                                    DecimalFormat format = new DecimalFormat();
                                    String temp = style.getDataFormatString();
                                    // 单元格设置成常规
                                    if ("General".equals(temp)) {
                                        format.applyPattern("#");
                                    }
                                    /*DecimalFormat对数字进行四舍五入操作*/
                                    //cellValue = format.format(value);
                                    cellValue = String.valueOf(value);
                                }
                                break;
                            case HSSFCell.CELL_TYPE_STRING: // 字符串
                                cellValue = cell.getStringCellValue();
                                break;

                            case HSSFCell.CELL_TYPE_BOOLEAN: // Boolean
                                cellValue = cell.getBooleanCellValue() + "";
                                break;

                            case HSSFCell.CELL_TYPE_FORMULA: // 公式
                                cellValue = cell.getCellFormula() + "";
                                break;

                            case HSSFCell.CELL_TYPE_BLANK: // 空值
                                cellValue = "";
                                break;

                            case HSSFCell.CELL_TYPE_ERROR: // 故障
                                cellValue = "非法字符";
                                break;
                            default:
                                cellValue = "未知类型";
                                break;
                        }
                    }
                    rowLst.add(cellValue);
                }
                data.add(rowLst);
            }
            is.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return data;
    }
    /**
     *
     * @描述：是否是2003的excel，返回true是2003
     *
     * @作者：我
     * @参数：@return
     *
     * @返回值：boolean
     */

    public static boolean isExcel2003(String filePath)
    {

        return filePath.matches("^.+\\.(?i)(xls)$");

    }

    /**
     *
     * @描述：是否是2007的excel，返回true是2007
     * @作者：我
     * @参数：@return
     *
     * @返回值：boolean
     */

    public static boolean isExcel2007(String filePath)
    {

        return filePath.matches("^.+\\.(?i)(xlsx)$");

    }

}