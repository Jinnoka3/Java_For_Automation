package generics.generics2;

public class GenericMethod {

    static <T extends Comparable<T>, V extends T>

    boolean isEquals(T x, V y){

        if(x.equals(y)){
            return true;
        }
        return false;
    }

}
