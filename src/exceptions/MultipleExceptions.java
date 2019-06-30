package exceptions;

public class MultipleExceptions {

    public static void main(String args[]) {

        Multiple exception = new Multiple();
        try {
            exception.allExceptions();

        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    static class MyExceptions extends Exception {
    }
    static class Exception1 extends MyExceptions {
    }
    static class Exception2 extends MyExceptions {
    }
    static class Exception3 extends MyExceptions {
    }

    public static class Multiple {

        public void allExceptions() throws Exception1, Exception2, Exception3 {
            //throw new Exception1();
            //throw new Exception2();
            throw new Exception3();
        }
    }
}