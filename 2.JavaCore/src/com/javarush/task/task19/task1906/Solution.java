package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName1 = reader.readLine();
//        String fileName2 = reader.readLine();
//        reader.close();
        String fileName1 = "D:\\IdeaProjects\\JavaRushTasks\\source_files\\task1906\\1.txt";
        String fileName2 = "D:\\IdeaProjects\\JavaRushTasks\\source_files\\task1906\\2.txt";

        FileReader fileReader = new FileReader(fileName1);
        FileWriter fileWriter = new FileWriter(fileName2);

        while (fileReader.ready()) {
            int data = fileReader.read();
            System.out.print(data + " ");
        }
        System.out.println();

        fileReader.close();
        fileWriter.close();
    }
}
