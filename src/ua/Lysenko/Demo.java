package ua.Lysenko;

import java.io.*;
import java.util.Scanner;

public class Demo {
    public static String read(String path) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
            StringBuilder stringBuilder = new StringBuilder();
            String currentString;

            while ((currentString = reader.readLine()) != null) {
                stringBuilder.append(currentString);
                stringBuilder.append(" \n");
            }

            return stringBuilder.toString();
        } catch (IOException e) {
            System.out.println("Can't read file");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Can't close reader");
            }finally {
                return "";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(read("/home/user/test1.txt"));
    }
}
