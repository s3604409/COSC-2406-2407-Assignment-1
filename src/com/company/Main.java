package com.company;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {

        String path = "D:/artist.csv";
        String line = "";
        try {
            BufferedReader bReader = new BufferedReader(new FileReader(path));

            while((line = bReader.readLine()) !=null){
                System.out.println(line);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}


