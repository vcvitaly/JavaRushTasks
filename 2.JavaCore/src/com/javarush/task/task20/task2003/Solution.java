package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public static void fillInPropertiesMap() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
//        String fileName = "D:\\dev\\JavaRushTasks\\source_files\\task2003\\1.txt";
        bufferedReader.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        load(fileInputStream);
        fileInputStream.close();

    }

    public static void save(OutputStream outputStream) throws Exception {
        /*BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        for (String s : properties.keySet()) {
            bufferedWriter.write(s + " = " + properties.get(s));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();*/
        Properties prop = new Properties();
        for (HashMap.Entry<String, String> e : properties.entrySet()) {
            prop.setProperty(e.getKey(), e.getValue());
        }
        prop.store(outputStream, null);
    }

    public static void load(InputStream inputStream) throws Exception {
        Properties prop = new Properties();
        prop.load(inputStream);

        for (String key : prop.stringPropertyNames()) {
            properties.put(key,prop.getProperty(key));
        }
    }

    public static void main(String[] args) throws Exception {
//        fillInPropertiesMap();
//        System.out.println(properties);
//        String fileName = "D:\\dev\\JavaRushTasks\\source_files\\task2003\\2.txt";
//        save(new FileOutputStream(fileName));
    }
}
