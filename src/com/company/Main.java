package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader( new File("number.txt")));
        String i = bufferedReader.readLine();
        bufferedReader.close();
        String[] value = i.split(" ");
        int a = Integer.parseInt(value[0]);
        int b = Integer.parseInt(value[1]);
        String result = " " + (a + b);
        System.out.println(result);
        FileWriter writer = new FileWriter("result.txt");
        writer.write(result);
        writer.close();



    }
}
