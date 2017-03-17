package com.crawler;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by hamleta on 11/11/2016.
 */
public class JIRACrawler {

    private static String prefix = "https://jira.itsm.atosworldline.com/jira/browse";

    public static void main(String[] args) {
        String inputFileName;
        if (args.length != 0) {
            inputFileName = args[0];
        }
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the input file name: ");
            inputFileName = scanner.nextLine();
        }
        System.out.println("input: " + inputFileName);
        ArrayList<String> urls = readJIRAURLs(inputFileName, prefix);

        System.out.println("the URLs: " + urls);

        String outputFileName = "output.txt";

        try {
            FileWriter fileWriter = new FileWriter(outputFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String url : urls) {
                bufferedWriter.write(url);
                bufferedWriter.newLine();
                Crawler theCrawler = new Crawler(url);
                String summary = theCrawler.crawl("summary-val");
                if (summary != null) {
                    bufferedWriter.write(summary);
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.close();
        }
        catch (IOException ex) {
            System.err.println("Error writing to a file '" + outputFileName + "'");
        }
    }

    private static ArrayList<String> readJIRAURLs(String fileName, String prefix)
    {
        ArrayList<String> theURLs = new ArrayList<String>();

        String line = null;
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);


            while ((line = bufferedReader.readLine()) != null)
            {
                if (!JIRAMatcher.isJIRA(line))
                {
                    System.err.println("Read: " + line + " - is NOT from our JIRA project");
                    continue;
                }
                theURLs.add(prefix + "/" + line);
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
            theURLs.clear();
        }
        catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
            theURLs.clear();
        }

        return theURLs;
    }
}
