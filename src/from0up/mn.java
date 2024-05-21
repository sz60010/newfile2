package from0up;

public class mn {
    public static void main(String args[]){
        int m=2,n=3,i=1;
        int res=1;
        while(n>=1){
            res=res * m;
            n--;
     //   while(i<=n){
     //     res= res *m;
     //      i++;
        }
        System.out.println("the result is " + res);
    }
}
//while 循环中 i 为循环变量 从1 开始到n结束 步幅是1
//定义res 变量 暂时承载中途运算结果，while循环做乘法经常需要。

