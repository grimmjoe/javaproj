/**
 * Created by hamleta on 10/24/2016.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmployeeTest {

    private static void testEmployee()
    {
        // Create two employees
        Employee first = new Employee("First Employee");
        Employee second = new Employee("Second Employee");

        // Setup the employees
        first.empAge(25);
        first.empDesignation("Senior Developer");
        first.empSalary(458000);

        second.empAge(31);
        second.empDesignation("Team Leader");
        second.empSalary(800000);

        first.printEmployee();
        second.printEmployee();

        System.out.println("first is " + (first instanceof Employee));
    }

    public static void main(String[] args) {
//
//        testArguments(args);
//
//        testEmployee();
//
//        testArrayLoop();
//
//        testArrays();
//
//        testNumberClasses();
//
//        testString();
//
//        testDate();

        testRegex();
    }

    private static void testRegex() {
        String patternStr = "(.*)(\\d+)(.*)";
        String line = "This order was placed for QT3000! OK?";

        Pattern pattern = Pattern.compile(patternStr);
        Matcher m = pattern.matcher(line);
        if (m.find( ))
        {
            System.out.println("Found: " + m.group(0));
            System.out.println("Found: " + m.group(1));
            System.out.println("Found: " + m.group(2));
        }
        else
        {
            System.out.println("Didn't find anything");
        }
    }

    private static void testDate() {
        String dateStr = "2016-10-25";
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");

        Date date;

        try
        {
            date = format.parse(dateStr);
            System.out.println("Date = " + date);
        } catch (ParseException e)
        {
            System.out.println("Could not parse " + dateStr);
            System.out.println("Error " + e.getMessage());
        }
    }

    private static void testArrays() {
        int[] arr = new int[5];
        Arrays.fill(arr, 10);
        printIntArray(arr);
    }

    private static void printIntArray(int[] arr) {
        for (int elem : arr)
        {
            System.out.print(elem + " ");
        }
        System.out.print("\n");
    }

    private static void testArguments(String[] args) {
        System.out.println("Arguments: ");
        for (String arg : args)
        {
            System.out.println("Arg = " + arg);
        }
    }

    private static void testString() {
        String str = String.format("Formatting a %d string", new Integer(1));
        System.out.println("Formatted string is " + str);
    }

    private static void testNumberClasses() {
        Number num = new Integer(5);
        System.out.println("Num = " + num);
    }

    private static void testArrayLoop()
    {
        int[] intArr = {10, 20, 30};

        for (int elem : intArr)
        {
            System.out.print(elem + " ");
        }
        System.out.println("");
    }
}
