public class LoopInArrays {
    public static void main(String args[]){
        double[] numList=new double[]{121.9,200.9,304.4,312.5};
        //print all the array elements
        for(int i=0;i<numList.length;i++){
            System.out.println(numList[i]);
        }
        //sum all the elements
        double sum=0;
        for (int i=0;i<numList.length;i++){
            sum=sum+numList[i];
        }
        System.out.println("sum is "+sum);
        //find the largest number in this arrays
        double max=numList[0];
        for(int i=1;i<numList.length;i++){
            if (numList[i]>max) {
                max=numList[i];
            }

        }System.out.println("The largest number is "+max);

    }
}
