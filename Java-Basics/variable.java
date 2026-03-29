public class variable {
    // Instance variable
    int instanceVar = 10;

    // Static variable
    static int staticVar = 20;

    public void showVariables() {
        // Local variable
        int localVar = 30;

        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        variable obj1 = new variable();
        variable obj2 = new variable();

        obj1.showVariables();
        obj2.showVariables();

        // Changing static variable
        variable.staticVar = 50;

        System.out.println("After changing static variable:");
        obj1.showVariables();
        obj2.showVariables();
    }
}
