public class Main {

    public static void main(String[] args) {

        Box<Integer> simpleBox = new Box<>();
        simpleBox.set(new Integer(1));
        System.out.println(simpleBox.get());

        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(2, "pear");
        Pair<Integer, String> p3 = new Pair<>(1, "apple");
//        boolean same = Util.<Integer, String>compare(p1, p2);
        boolean same = Util.compare(p1, p3);

        if(same){
            System.out.println("Same");

        }

        else{
            System.out.println("not same");
        }


    }
}
