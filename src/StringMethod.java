public class StringMethod {
    public static void main(String args[]){
        System.out.println(greet("Danny"));
        System.out.println(greet("John"));
        System.out.println(greet("Stacy"));
        System.out.println(greet("kevin"));
    }
    public static String greet(String name){
        return String.format("Hello %s, Welcome to Java Class.",name);
    }
}

