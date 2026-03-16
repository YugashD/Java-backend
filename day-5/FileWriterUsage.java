package com.abc;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUsage {
	public static void main(String[] args) {

        try {
            // Step 1: Create FileReader object
            FileWriter fw = new FileWriter("sample2.txt");
            int i;   
            System.out.println("Writing data to file:");
            fw.write("Contents inside the file");
            System.out.println("Written in file");
            // Step 3: Close the file
            fw.close();
        }
        catch(IOException e) {
            System.out.println("Error occurred: " + e);
        }
    }
}
