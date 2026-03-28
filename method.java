//instance method
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}
public class method {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 3)); // 8
    }
}
