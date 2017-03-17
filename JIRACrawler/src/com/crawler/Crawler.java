package com.crawler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;


/**
 * Created by hamleta on 11/11/2016.
 */
public class Crawler {
    private URL theURL;

    public Crawler(String theUrl)
    {
        try {
            theURL = new URL(theUrl);
        }
        catch(MalformedURLException ex) {
            ex.printStackTrace();
        }
    }

    public String crawl(String searchString) {
        String fullHTML = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(theURL.openStream()));

            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                fullHTML += str;
            }
            bufferedReader.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

//        System.out.println("HTML");
//        System.out.println(fullHTML);


        Document doc = Jsoup.parse(fullHTML);
        Elements elements = doc.select("#" + searchString);

        String text = null;

        if (elements.isEmpty()) {
            System.out.println("Couldn't find #" + searchString);
        } else {
            text = elements.first().text();
            System.out.println("TEXT = '" + text + "'");
        }

        return text;
    }
}
