public class helloworld{
    public static void main(String[]args){
        int price = 1000;
        int price1 = 1000;
        float inc1 = price*90/100;
        float inc2 = price1*120/100;
        float netprofit = (price+price1)-(inc1+inc2);
        System.out.print(netprofit);
    }
} //my comment