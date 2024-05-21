package from0up;

public class WhileJiShu {
    public static void main(String args[]){
        int i=1;
        int n=10;
        while (i < n){
            if(i%2!=0){ //模运算 求余数
                System.out.println(i);
            }
            i++;
        }
    }
}
