public class BooleanMethod {
    public static void main(String args[]){
        System.out.println(isEven(20));
        System.out.println(isEven(22));
        System.out.println(isEven(444442));
        System.out.println(isEven(223231));
    }

    public static boolean isEven( int number){
        if(number % 2==0){
            return true;
        }
        return false;
    }
}
