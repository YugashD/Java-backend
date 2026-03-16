package com.abc;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderUsage {

    public static void main(String[] args) {

        try {
            // Step 1: Create FileReader object
            FileReader fr = new FileReader
            		("C:\\Users\\YD5\\Desktop\\Day2\\day5\\src\\com\\abc\\sample");
            int i;   
            System.out.println("Reading data from file:");
            // Step 2: Read character by character
            while((i = fr.read()) != -1) {
                System.out.print((char)i);
            }
            // Step 3: Close the file
            fr.close();
        }
        catch(IOException e) {
            System.out.println("Error occurred: " + e);
        }
    }
}