public class DataType {
    public static void main(String[] args) {
        // Primitive Data Types
        byte b = 100;
        short s = 2000;
        int i = 50000;
        long l = 10000000000L;

        float f = 12.34f;
        double d = 12345.6789;

        char c = 'A';
        boolean flag = true;

        // Non-Primitive Data Types
        String str = "Hello, Java!";
        int[] arr = {1, 2, 3, 4, 5};

        // Output
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        System.out.println("String: " + str);
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
