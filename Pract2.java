package lambda;

interface Executable2 {
    int execute2();
}

class Runner2 {
    public void run2(Executable2 e2) {
        int a = e2.execute2();
        System.out.println(a);
    }
}


public class Pract2 {
    public static void main(String[] args) {
        Runner2 runner2 = new Runner2();


        runner2.run2(new Executable2() {
            @Override
            public int execute2() {
                System.out.println("Hello2");
                System.out.println("Java2");

                return 1;
            }
        });

        runner2.run2(() -> {
            System.out.println("Hello3");
            System.out.println("Java3");

            return 2;
        });


    }
}