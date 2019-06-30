package exceptions;

public class CustomException {

    public static void main(String args[]) {

        try {
            throw new MyException("Hello!");

        }
        catch(MyException e) {
            e.printLine();
        }
    }

    static class MyException extends Exception {

        private String line;

        public MyException(String line) {
            this.line = line;
        }

        public void printLine() {
            System.out.println(line);
        }
    }

}



