package main.java.hello;

import org.joda.time.LocalTime;

/**
 * Created by hamleta on 3/9/2017.
 */
public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }

}
