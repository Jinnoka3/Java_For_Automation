package generics.generics2;

import inner.inner1.Circle;

public class GenericMethod {

    static <T extends Comparable> boolean compareTo(T x, T y){

        if(x.getClass() != y.getClass()){
            return false;
        }

        return x.compareTo(y) == 0;
    }
}
