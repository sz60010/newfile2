package from0up;
//写一个程序分解一个整数每一位的数字，对于一个int n，从个位开始分行输出他每一位的数字。比如，n=1234，最后在console的输出就是（分行的） 4 3 2 1
public class while2 {
    public static void main(String args[]){
        int n = 1234;
        while(n>0){
            int r= n % 10;
            int q= n / 10; //除号两边都是int型 整除
            System.out.println(r);
            n=q;
        }

    }
}
