package hamlet.java.core.demo;

/**
 * Created by hamleta on 2/9/2017.
 */
public interface AbstractStack {
    /**
     * Push a value into the stack
     * @param value The new value to be pushed
     * @throws StackOverflowError
     */
    void push(int value) throws StackOverflowError;

    /**
     * Pop a value from the stack
     * @return The value on top of the stack
     * @throws StackOverflowError
     */
    int pop() throws StackUnderflowException;
}
