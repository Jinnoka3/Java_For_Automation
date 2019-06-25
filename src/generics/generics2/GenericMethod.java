package generics.generics2;

public class GenericMethod {

    static <T extends Comparable<T>> boolean isEquals(T x, T y){

        if(x.compareTo(y) == 0){
            return true;
        }
        return false;
    }

}
