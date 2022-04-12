package com.company;
import java.util.Scanner;
import java.io.FileReader;
import java.io.*;


public class Laboratory_work {
    public static void main(String[] args) {
        try {
            InputStream sourceStream = new FileInputStream("C:\\Users\\KUANYSH\\IdeaProjects\\untitled1\\src\\com\\company\\text\\JavaSomeInputText.txt");
            byte[] sourceArray = new byte[sourceStream.available()];
            sourceStream.read(sourceArray);

            byte key = '6';


            for (int i = 0; i < sourceArray.length; i++) {
                sourceArray[i] = (byte) (sourceArray[i] ^ key);
            }

//            for (int i = 0; i < sourceArray.length; i++) {
//                sourceArray[i] = (byte) (sourceArray[i] ^ key);
//            }

            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\KUANYSH\\IdeaProjects\\untitled1\\src\\com\\company\\text\\JavaSomeOutputText.txt");
            fileOutputStream.write(sourceArray, 0, sourceArray.length);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
