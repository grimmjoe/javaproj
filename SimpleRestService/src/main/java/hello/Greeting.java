package main.java.hello;

/**
 * Created by hamleta on 3/9/2017.
 */
public class Greeting {
    private final long id;
    private final String message;

    public Greeting(long i, String msg)
    {
        id = i;
        message = msg;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return message;
    }
}
