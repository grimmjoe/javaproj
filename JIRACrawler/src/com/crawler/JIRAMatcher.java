package com.crawler;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by hamleta on 11/11/2016.
 */
public class JIRAMatcher {
    private static String reiSoftPos = "REISOFTPOS";
    private static String reiCacRist = "REICACRIST";
    private static Pattern jiraPattern = Pattern.compile("\\s*(" + reiSoftPos + "|" + reiCacRist + ")-\\d+\\s*");

    public static boolean isJIRA(String taskName)
    {
        Matcher m = jiraPattern.matcher(taskName);
        return m.matches();
    }
}
