package PageObjects;


import Utilities.ExcelUtilities;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Test {
    String name = "Vignesh";//literal
    String name2 = "Vignesh";//literal

    String name3 = new String("Vignesh");//Object
/* if we use equalto(==) operator to compare s1,s3 and name,name3 it will return false because it will check
whether both elements refers to the same memory.

whereas equals() compares the contents of the string
 */
    static String a=" ";
    static int temp;

    public static void main(String[] args) throws IOException {
        /*Test test1 = new Test();
        Test test2 = new Test();
        System.out.println(test1.name == test1.name2); //true
        System.out.println(test1.name == test2.name2); //false
        System.out.println(test1.name.equals(test1.name2)); //true
        System.out.println(test1.name.equals(test2.name2)); //true


        Test ob = new Test();
        String s1 = "Gokul";
        String s2 = "Gokul";
        String s3 = new String("Gokul");//Object
        System.out.println(s1 == s3);//------false
        System.out.println(s1 == s2);//------true
        System.out.println(s1.equals(s3));
        System.out.println(ob.name == ob.name3);//------false
        System.out.println(ob.name == ob.name2);//------true
        System.out.println(ob.name.equals(ob.name3));//------true
        System.out.println("empty: "+a.isEmpty());
        System.out.println("blank: "+a.isBlank());
        int a=2;
        String v= String.valueOf(a);
*/

//        List<List<String>> data= ExcelUtilities.readExcelData();
//        FileWriter fw=new FileWriter("C:\\Users\\svign\\IdeaProjects\\Cucumber_Automation\\src\\main\\java\\Features\\Form.feature",true);
//        BufferedWriter bw=new BufferedWriter(fw);
//        for(List<String> row:data) {
//            bw.write("|"+row.get(0)+"|"+row.get(1)+"|"+row.get(2)+"|"+row.get(3)+"|"+row.get(4)+"|"+row.get(5)+"|"+row.get(6)+"|"+row.get(7)+"|"+row.get(8)+"|"+row.get(9)+"|");
//        }
//
//        bw.close();



int n=3;
for(int i=0;i<n;i++){
for(int j=0;j<n-i;j++){
    System.out.print(" ");
}
    for(int k=0;k<=2*i;k++) {

        System.out.print("*");
    }
    System.out.println();
}

}


    }





