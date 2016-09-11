public class HelloWorld {
    public static String hello(String str) {
        return str != null && !str.isEmpty() ? "Hello, " + str + "!" : "Hello, World!";
    }
}