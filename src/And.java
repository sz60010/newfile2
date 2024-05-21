import java.sql.SQLOutput;

public class And {
    public static void main(String args[]){
        double GPA=3.6; //赋值
        if(GPA==4.0){   //等于
            System.out.println("A+");
        }else if (GPA>=3.5 && GPA<4.0){
            System.out.println("A");
        }else if(GPA>=3 && GPA<3.5){
            System.out.println("B");
        }else if(GPA>=2.5 && GPA<3){
            System.out.println("C");
        }else{
            System.out.println("F");
        }
    }
}

