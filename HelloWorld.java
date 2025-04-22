public class HelloWorld {

    // Constructor
    public HelloWorld() {
        System.out.println("Hello from the constructor!");
    }

    // Method to print Hello, World!
    public void sayHello() {
        System.out.println("Hello, World!");
    }

    // Main method
    public static void main(String[] args) {
        // Create an object of HelloWorld
        HelloWorld hello = new HelloWorld();

        // Call the sayHello method
        hello.sayHello();
    }
}

