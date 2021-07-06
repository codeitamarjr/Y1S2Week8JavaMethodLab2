public class ShareProfit {
    //Profit =((NS * SP) - SC) - ((NS * PP) + PC) where NS is the number of shares, PP is the purchase price per share, PC is the purchase commission paid, SP is the sale price per share, and SC is the sale commission paid.
    //
    //(a) Write a method with arguments number of shares, the purchase price per share, the purchase commission paid, the sale price per share, and the sale commission paid. The method should return the profit (or loss) from the sale of the shares.
    //
    //(b) Write a program ShareProfit to test the method using different parameters.


    public static double profit(double numberOfShares, double purchasePrice, double purchaseCommissionPaid, double salePricePerShare, double saleCommissionPaid){

        return ((numberOfShares*salePricePerShare)-saleCommissionPaid) - ((numberOfShares * purchasePrice) + purchaseCommissionPaid);


    }
}
