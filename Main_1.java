class Alg {
    int a;
    int b;

    // Constructor
    public Alg(int x, int y) {
        System.out.println("Constructor is Called");
        a = x;
        b = y;
    }

    int add() {
        return a + b;
    }

    int sub() {
        return a - b;
    }
}

public class Main_1 {
    public static void main(String[] args) {
        Alg obj = new Alg(10, 5);
        System.out.println(obj.add());
        System.out.println(obj.sub());

        Alg obj2 = new Alg(6, 4);
        System.out.println(obj2.add());
        System.out.println(obj2.sub());
    }
}
