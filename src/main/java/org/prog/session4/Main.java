package org.prog.session4;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
//            smth1(null);
            System.out.println("this never works");
            readFile1();
        } catch (Exception e) {
            System.out.println("oops!");
//            throw new RuntimeException("oops!");
        } finally {
            System.out.println("this works always!");
        }
        System.out.println("this will work");
    }

    public static void errorOnSomeNumber(int i) {
        if (i == 10) {
            throw new RuntimeException();
        } else {
            System.out.println(i);
        }
    }

    public static void smth1(String s) {
        smth2(s);
    }

    public static void smth2(String s) {
        System.out.println(s.length());
    }

    public static void readFile1(){readFile2();}
    public static void readFile2(){
        try {
            readFile3();
        } catch (Exception e) {
            System.out.println("File Not Found Exception processed here");
        }
    }
    public static void readFile3(){readFile4();}
    public static void readFile4(){readFile5();}
    public static void readFile5(){readFile6();}
    public static void readFile6() {
        try {
            FileReader fileReader = new FileReader("asd.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
