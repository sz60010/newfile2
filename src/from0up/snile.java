package from0up;

public class snile {
    public static void main(String args[]){
        int x=5,y=2,tree=10;
        int day=0, height=0;
        while(true){
            height=height + x;
            if(height>=tree){
                day=day + 1;
                break;
            }
            else{
                height= height- y;
                day = day + 1;
            }
        }System.out.println(day);
    }
}
