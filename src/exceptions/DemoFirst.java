package exceptions;

public class DemoFirst {
    public static void main(String[] args) {

        new DemoFirst().exceptionMethod();
    }

    void exceptionMethod(){
        try{
            System.out.println("Try");
            throw new ArrayIndexOutOfBoundsException();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Catch");
            e.printStackTrace();
        }
    }
}
