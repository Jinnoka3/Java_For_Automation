package exceptions;

public class DemoException {

    public static void main(String[] args){
        try{
            System.out.println("Try");
            throw new Exception("Exception!");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Finally!");
        }
    }
}
