package PageObjects;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static Utilities.ScreenshotUtilities.firstNameScreenshotFilePath;
import static org.apache.poi.xwpf.usermodel.Document.PICTURE_TYPE_PNG;

public class sample {
   static int temp;

    static int sum;
    public static void main(String args[]) throws IOException, InvalidFormatException {
        FileInputStream fi=new FileInputStream("D://Cucumber_LetCode_Automation//Execution_Reports//LetCode_Automation_Report.docx");
        XWPFDocument document=new XWPFDocument();
        XWPFParagraph paragraph=document.createParagraph();
        XWPFRun run=paragraph.createRun();
        FileInputStream fis=new FileInputStream(firstNameScreenshotFilePath.getPath());
        run.setText("here is thescreenshot");
        run.addPicture(fis, PICTURE_TYPE_PNG,firstNameScreenshotFilePath.getPath(),500,300);
        fis.close();
        FileOutputStream fos=new FileOutputStream("D://Cucumber_LetCode_Automation//Execution_Reports//LetCode_Automation_Report.docx");
        document.write(fos);
        fos.close();
        document.close();
       /* TreeSet<Integer> ts=new TreeSet();
        ts.add(26);
        ts.add(95);
        ts.add(478);
        ts.add(84);
        ts.add(72);*/
        int a[]={1,87,34,78,987,345,656};
        /*TreeSet<Integer> ts=new TreeSet();*/
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            al.add(a[i]);
        }

        /*System.out.println(al.get(al.size()-2));*/
//        List<Integer> al1=al.stream().sorted().collect(Collectors.toList());
//        System.out.println(al1);
//        al1.stream().forEach(System.out::println);
//        List<Integer>al2=al.stream().filter(n -> n>100).collect(Collectors.toList());
//        System.out.println("nos greater than 100: "+al2);
//
//        int largestElement= Collections.min(al);
//        System.out.println(largestElement);
//        /*System.out.println(SquareOfElelements);*/
//
//
//        System.out.println(al1.get(al1.size()-2));
//        IntStream.rangeClosed(1,10).flatMap(n-> IntStream.of(n*n)).forEach(System.out::println);





        /*System.out.println(ts);

        List<Integer> al=new ArrayList<>(ts);
        ArrayList<Integer>newal=new ArrayList<>();
        for(int el:al){
           sum= el+sum;
          *//*  if(el>temp){
                temp=el;
                newal.add(temp);
            }*//*

        }
        *//*System.out.println(newal.get(newal.size()-2));*//*
        System.out.println(sum);*/
    }
}

