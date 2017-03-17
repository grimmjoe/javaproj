package com.mytests.oop_test;



/**
 * Created by hamleta on 11/3/2016.
 */
public class OOP_Test {
    public static void main(String[] args) {
        System.out.println("Hello");

        testSimpleInheritance();
    }

    private static void testSimpleInheritance() {
        class Super
        {
            Super(int x)
            {
                mNumber = x;
            }
            private int mNumber = 0;

            public void setNumber(int num)
            {
                System.out.println("Set number");
                mNumber = num;
                doSomthing();
                doSomethingPrivate();
            }

            public int getNumber()
            {
                System.out.println("Get Number");
                return mNumber;
            }

            protected void doSomthing()
            {
                System.out.println("Doing Something in Super class");
            }

            private void doSomethingPrivate()
            {
                System.out.println("Private Do Something in Super Class");
            }
        }

        class Derived extends Super
        {
            Derived()
            {
                this(0);
            }

            Derived(int x)
            {
                super(x);
            }

            public void derivedFunction()
            {
                System.out.println("Derived Function");
                doSomthing();
            }

            public void doSomethingDerived()
            {
                System.out.println("Doing something in derived");
                super.doSomthing();
            }
        }
        Derived obj = new Derived();
        obj.doSomthing();
        obj.derivedFunction();
        obj.setNumber(5);
        obj.doSomethingDerived();

        Super base = new Derived();
        base.doSomthing();
        base.setNumber(3);
        System.out.println("The number got " + base.getNumber());
    }
}
