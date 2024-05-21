package from0up;

public class bing {
    public static void main(String args[]){
        int bing=7;
        while(true){
            if (bing % 3 ==2 && bing %5 ==2 && bing % 7 ==2){
                System.out.println(bing);
                break;
            }
            bing++;
        }
    }
}
