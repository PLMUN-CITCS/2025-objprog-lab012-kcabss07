public class MethodDemo {
    public static void main(String[] args) {
        printMessage("This is my message!");
        greet();

    }

    public static void greet() {
        System.out.println("Hello from the greet method!"); 
     }

     public static void printMessage(String message) {
        System.out.println(message);
     }
}