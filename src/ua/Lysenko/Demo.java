package ua.Lysenko;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
    public static String read(String path) {

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            StringBuilder stringBuilder = new StringBuilder();
            String currentString;

            while ((currentString = reader.readLine()) != null) {
                stringBuilder.append(currentString);
                stringBuilder.append(" \n");
            }

            return stringBuilder.toString();
        } catch (IOException e) {
            System.out.println("Can't read file");
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(read("/home/user/test1.txt"));
    }
}
