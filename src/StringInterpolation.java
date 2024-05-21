public class StringInterpolation {
    public static void main(String args[]){
        String custName="Kevin";
        String streetName="4131 California Avenue";
        int age=35;
        String city="Los Angeles";
        String state="California";
        String zipCode="90012";
        String country="USA";
        //System.out.println(String.format("Student Details:name: %s,age: %d, Address: %s,City: %s,State: %s,Zipcode: %s,country: %s",
                //custName,age,streetName,city,state,zipCode,country));
        System.out.println(String.format("Student Detail: name: %s, age: %d, address: %s, city: %s,state: %s,zipcode: %s,country: %s", custName,age,streetName,
                city,state,zipCode,country));
    }
}
