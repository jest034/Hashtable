public class HashSetTester {

    public static void main(String [] args) {

        MyHashSet mySet = new MyHashSet(4, 1.5);


        int i = 1;
        int m = 1;

        for (int t = 0; t < 2; t++) {
            mySet.add(new Integer(i));
            i += m;
            m += 7;
        }

        System.out.println("Trial 1: " + mySet);

        for (int t = 0; t < 3; t++) {
            mySet.add(new Integer(i));
            i += m;
            m += 7;
        }

        System.out.println("Trial 2: " + mySet);

        for (int t = 0; t < 4; t++) {
            mySet.add(new Integer(i));
            i += m;
            m += 7;
        }

        System.out.println("Trial 3: " + mySet);

        System.out.println("Contains 25: " + mySet.contains(new Integer(25)));
        System.out.println("Contains 26: " + mySet.contains(new Integer(26)));

        mySet.remove(new Integer(75));
        mySet.remove(new Integer(76));
        mySet.remove(new Integer(1));
        mySet.remove(new Integer(10));


        System.out.println("Trial 4: " + mySet);
    }
    
}