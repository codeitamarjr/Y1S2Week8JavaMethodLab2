public class LargestNumberArray {
    public static int largest(int[] numberList){
        int Max=numberList[0];
        for (int i = 0 ; i < numberList.length ; i++){
            if(numberList[i]>Max){
                Max=numberList[i];
            }
        }  return Max;
    }
}
