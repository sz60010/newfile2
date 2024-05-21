package from0up;

public class FOR {
    public static void main(String args[]){
       int message[]={23, 45, 67, 39, 19, 23, 78};
       boolean dinner[] = new boolean[message.length];
       for(int i=0; i< message.length; i++){
           if(message[i]>30 && message[i]<40){
               dinner[i]=true;
           }else{
               dinner[i]=false;

           }
           System.out.println(dinner[i]);
       }



    }
}
