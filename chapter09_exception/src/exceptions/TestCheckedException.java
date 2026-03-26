package exceptions;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestCheckedException {
    @Test
    public void test06() {
        try {
            Thread.sleep(1000); // ：线程休眠1秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //InterruptedException
    }

    @Test
    public void test07() {
        try {
            Class c = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
//ClassNotFoundException
        }
    }
    @Test
    public void test08(){
        try {
                Connection conn = DriverManager.getConnection("..,");
            } catch (Exception e) {
                e.printStackTrace();
        }
    }
    @Test
    public void test09() {
        try {
            FileInputStream fis = new FileInputStream("a.text");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

        public void test10() {
            File file = new File("尚硅谷Java秘籍.txt");
            try{
            FileInputStream fis = new FileInputStream(file);
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }
/*            //FileNotFoundException
           try {
               int b = fis1.read();//IOException
               while (b != -1) {
                   System.out.print((char) b);
                   b = fis1.read();//IOException
               }
           }catch (IOException e){
                e.printStackTrace();
           }*/

            //fis.close();//IOException
        }

    }


