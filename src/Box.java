public class Box<T> {
    private T t;

    public void set(T t) { this.t = t; }

    public T get() { return t; }


    //To declare a bounded type parameter, list the type parameter's name,
    // followed by the extends keyword, followed by its upper bound, which in this example is Number.
    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

}