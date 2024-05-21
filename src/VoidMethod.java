public class VoidMethod {
    public static void main(String args[]){
        //Call greet method
        greet("John");
        greet("Kevin");
        greet("Stacy");
        greet("Raj");
    }
    //Method that greet stranger
    public static void greet(String name){
        System.out.println(String.format("Hello %s",name));
    }
}