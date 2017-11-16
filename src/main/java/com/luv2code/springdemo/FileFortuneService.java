package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService {

    private String fileName ="C:\\Users\\piotr\\IdeaProjects\\spring-demo-annotations\\src\\main\\resources\\fortunes.txt";
    private List<String> fortunes;

    private Random rand = new Random();


    public FileFortuneService() {

        File theFile = new File(fileName);

        System.out.println("reading fortunes from the file: " + theFile);
        System.out.println("does the file exist: " + theFile.exists());

        fortunes = new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(
                new FileReader(theFile))) {

            String tempLine;

            while ((tempLine = br.readLine()) != null) {
                fortunes.add(tempLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public String getFortune() {

            int index = rand.nextInt(fortunes.size());

            String tempFortune = fortunes.get(index);

            return tempFortune;
    }
}
