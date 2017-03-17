import hamlet.java.core.demo.*;

/**
 * Created by hamleta on 1/25/2017.
 */
public class StackTest {
    public static void main(String[] args) {
        System.out.println("Stack test");

        Stack stack = new Stack();

        try {
            for (int i = 1; i <= 4; ++i)
                stack.push(i);

            for (int i = 1; i <= 4; ++i)
                System.out.println(stack.pop());

            stack.pop();
            stack.pop();
        }
//        catch (StackOverflowError err)
//        {
//            System.out.println(err.getMessage());
//        }
//        catch (StackUnderflowException err)
//        {
//            System.out.println(err.getMessage());
//        }
        catch (StackUnderflowException | StackOverflowError err)
        {
            System.out.println(err.getMessage());
        }

        finally {
            System.out.println("Finally is called");
        }
    }
}
