///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package edu.poly.timetable;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
///**
// *
// * @author Dell
// */
//public class Xfile {
//    public static void read(String path, String MaHP) throws FileNotFoundException, IOException {
//        //ArrayList<String> MaHP = new ArrayList<>();
//        ArrayList<Integer> MaLop = new ArrayList<>();
//        ArrayList<String> TenMon = new ArrayList<>();
//        ArrayList<Integer> BD = new ArrayList<>();
//        ArrayList<Integer> KT = new ArrayList<>();
//        ArrayList<Integer> Thu = new ArrayList<>();
//        ArrayList<String> headers = new ArrayList<>();
//
//        try ( FileInputStream fis = new FileInputStream(path);) {
//            XSSFWorkbook importedfile = new XSSFWorkbook(fis);
//            XSSFSheet shee1 = importedfile.getSheetAt(0);
//
//            for (Row row : shee1) {
//                Iterator<Cell> cellIterator = row.cellIterator();
//                while (cellIterator.hasNext()) {
//                    Cell cell = cellIterator.next();
//                    if (row.getRowNum() == 0) {
//                        headers.add(cell.getStringCellValue());
//                    }else{
//                        switch (cell.getColumnIndex()) {
//                            //MaHP.add(cell.getStringCellValue());
//                            case 0:
//                                break;
//                            case 1:
//                                MaLop.add((int)cell.getNumericCellValue());
//                                break;
//                            case 2:
//                                TenMon.add(cell.getStringCellValue());
//                                break;
//                            case 3:
//                                BD.add((int)cell.getNumericCellValue());
//                                break;
//                            case 4:
//                                KT.add((int)cell.getNumericCellValue());
//                                break;
//                            case 5:
//                                Thu.add((int)cell.getNumericCellValue());
//                                break;
//                            default:
//                                break;
//                        }
//                    }
//                }
//            }
//            
//          fis.close();
//            
//            System.out.println("Successfully!");
//            System.out.println("MaHP: "+ MaHP);
//            System.out.println("MaLop: "+ MaLop);
//            System.out.println("TenMon: "+ TenMon);
//            System.out.println("BD: "+ BD);
//            System.out.println("KT: "+ KT);
//            System.out.println("Thu: "+ Thu);
//
//            //int length = fis.available();
//            // byte[] buffer = new byte[length];
//
//            //fis.read(buffer);
//            //return buffer;
//        } catch (IOException ex) {
//            Logger.getLogger(Xfile.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//}
