public class ConstructionMethold101 {
    //Constructor Method
    public ConstructionMethold101(){
        System.out.println("This is constructor method");
    }
    //Constructor Method with parameters
    public ConstructionMethold101(String param){
        System.out.println("This is constructor method with parameter " + param);
    }
    //instance method
    public void InstanceMethod(){
        System.out.println("This is instance method");
    }
}
    class ConstuctionMethodExample{
        public static void main(String args[]){
            ConstructionMethold101 method1= new ConstructionMethold101();
            method1.InstanceMethod();

    }
}
