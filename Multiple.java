interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

class Parrot implements Animal, Bird {
    public void eat() {
        System.out.println("Parrot eats seeds.");
    }

    public void fly() {
        System.out.println("Parrot can fly.");
    }
}

public class Multiple {
    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.eat();
        p.fly();
    }
}
