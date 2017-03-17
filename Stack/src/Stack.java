import hamlet.java.core.demo.*;

/**
 * Created by hamleta on 1/25/2017.
 */
public class Stack implements AbstractStack{
    private static final int STACK_MAX = 5;
    private int stack[];
    private int currentPos;

    Stack()
    {
        stack = new int[STACK_MAX];
        currentPos = -1;
    }


    public void push(int value) throws StackOverflowError
    {
        if (currentPos > stack.length-1)
            throw new StackOverflowError("Stack overflow");

        stack[++currentPos] = value;
    }

    /**
     *
     * @return
     * @throws StackOverflowError
     * @todo - Need new exception!
     */
    public int pop() throws StackUnderflowException
    {
        if (currentPos < 0)
            throw new StackUnderflowException("Stack underflow");

        return stack[currentPos--];
    }

    public boolean isEmpty()
    {
        return currentPos < 0;
    }
}
