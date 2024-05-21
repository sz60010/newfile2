public class StaticMethod {
    public static void main(String args[]){
        name_of_dog("Max");
        bark();
        sleep();
    }
    public static void name_of_dog(String name){
        System.out.println("My name is:" + name);
    }
    public static void bark(){
        System.out.println("I am barking.");
    }

    public static void sleep(){
        System.out.println("I am sleeping");
    }
}
