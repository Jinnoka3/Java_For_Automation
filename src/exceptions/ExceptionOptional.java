package exceptions;

public class ExceptionOptional {

    static class ExceptionOne extends Exception {}
    static class ExceptionTwo extends ExceptionOne {}
    static class ExceptionThree extends ExceptionTwo {}

    public static void main(String[] args) {
        A a = new C();

        try {
            a.exceptionThrow();
        }	catch(ExceptionThree e3) {
            System.out.println("Catch exception 3");
        }	catch(ExceptionTwo e2) {
            System.out.println("Catch exception 2");
        }	catch(ExceptionOne e1) {
            System.out.println("Catch exception 1");
        }
    }

    static class A {

        void exceptionThrow() throws ExceptionOne{
            throw new ExceptionOne();
        }
    }

    static class B extends A{

        void exceptionThrow() throws ExceptionTwo{
            throw new ExceptionTwo();
        }
    }

    static class C extends B{

        void exceptionThrow() throws ExceptionThree{
            throw new ExceptionThree();
        }
    }
}
