public class Main {

    public static void main(String[] args) {

        Box<Integer> simpleBox = new Box<>();
        simpleBox.set(new Integer(1));

        System.out.println(simpleBox.get());
    }
}
