package from0up;

import java.sql.SQLOutput;
//if else if
public class practice {
    public static void main(String args[]) {
      int grade=70;
      if(grade>=90){
          System.out.println("A");
      }
      else if(grade>=80){
          System.out.println("B");
        }
      else if(grade>=70){
          System.out.println("C");
      }
      else if(grade>=60){
          System.out.println("D");
      }
      else{
          System.out.println("F");
      }
      Point p = new Point();
      Point p1 = new Point();
      Point p2;
      p1 = p;
      p2 = p;
      bar(p1);
      foo(p2);
      System.out.println(p.x);

    }

    static class Point{

        int x;
        int y;
    }
    public static void foo(Point p) {
        p.x = 5;
    }

    public static void bar(Point p) {
        p.x =  10;
    }
}
