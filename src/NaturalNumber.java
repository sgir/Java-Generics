//bounded type parameters allow you to invoke methods defined in the bounds: here Integer
public class NaturalNumber<T extends Integer> {

    private T n;

    public NaturalNumber(T n) {

        this.n = n;
    }


//    The isEven method invokes the intValue method defined in the Integer class through n.


    public boolean isEven() {
        return n.intValue() % 2 == 0;
    }

    public static <T extends Comparable<T>>  int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }
}
