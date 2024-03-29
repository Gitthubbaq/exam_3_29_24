package org.example;

import java.io.*;
import java.util.Base64;

public class base64_1 {

    public static void main(String[] args) throws Exception{
        Base64.Encoder encoder = Base64.getEncoder();
            String inFile = "in.txt";
            FileInputStream inStream = new FileInputStream(inFile);
            byte[] inBy = new byte[(int) new File(inFile).length()];
            inStream.read(inBy);
            inStream.close();
            byte[] encodedBytes = encoder.encode(inBy);
            String outFile = "out.txt";
            FileWriter fileWriter = new FileWriter(outFile);
            fileWriter.write(new String(encodedBytes));
            fileWriter.close();
    }
}