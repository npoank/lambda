package lambda;

interface RedIntface {
    int redIntfaceMeth(int x, int y);
}

class Green {
    public void green(RedIntface objRed) {
        int a = objRed.redIntfaceMeth(10, 15);
        System.out.println(a);
    }
}

public class Pract3 {
    public static void main(String[] args) {
        Green greenobj = new Green();

        greenobj.green(new RedIntface() {
            @Override
            public int redIntfaceMeth(int x, int y) {
                System.out.println("redIntfaceMeth");
                return x + y;
            }
        });


        greenobj.green((int x, int y) -> {
            System.out.println("Green method");
            return x + y + 5;
        });

        final int A = 10; // only constant
        greenobj.green((x, y) -> x + y + A);

    }
}
