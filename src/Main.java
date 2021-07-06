import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //int number1=5;
        //int number2=4;
        //int number3=3;
        //System.out.println(LargestNumber.largest(number1,number2,number3));

        Scanner keyboard = new Scanner(System.in);

        //System.out.println("How many numbers do you want to compare?");
        //int size = keyboard.nextInt();
        //int[] numberList = new int[size];

        //for (int i = 0 ; i < numberList.length ; i++) {
        //    System.out.println("What's the number #" + (i+1));
        //    numberList[i] = keyboard.nextInt();
        //}
        //int Max = LargestNumberArray.largest(numberList);
        //System.out.println("The largest number is "+Max);


        double numberOfShares=20;
        double purchasePrice=15.99;
        double purchaseCommissionPaid = 5;
        double salePricePerShare = 5;
        double saleCommissionPaid = 3;
        double profit = ShareProfit.profit(numberOfShares,purchasePrice,purchaseCommissionPaid,salePricePerShare,saleCommissionPaid);
        System.out.println(profit);

    }
}
