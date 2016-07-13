public class Main {

    public static void main(String[] args) {

        Box<Integer> simpleBox = new Box<>();
        simpleBox.set(new Integer(1));
        System.out.println(simpleBox.get());



        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));
        // this will need to be bounded by number typ!
        integerBox.inspect(10);

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


        //Generic methods and bounded types
        Integer[] array = {1,2,3};
        Integer e = 1;
        int count = NaturalNumber.countGreaterThan(array,e);
        System.out.println(count);
        NaturalNumber<Integer> naturalNumber1 = new NaturalNumber<Integer>(1);
        NaturalNumber<Integer> naturalNumber2 = new NaturalNumber<Integer>(2);

        System.out.println("naturalNumber is" + naturalNumber2.isEven());

    }
}
