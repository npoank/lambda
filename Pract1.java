package lambda;

interface Executable {
    void execute();
}

class Runner {
    public void run(Executable e) {
        e.execute();
    }
}

class ExecutableImplement implements Executable {

    @Override
    public void execute() {
        System.out.println("Hello1");
    }
}

public class Pract1 {
    public static void main(String[] args) {
        Runner runner = new Runner();

        runner.run(new ExecutableImplement());

        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Hello2");
            }
        });

        runner.run(() -> System.out.println("Hello3"));


    }
}
