public class SumOfTwoDice{
    public static void main(String[] args){
        double dice1 = Math.random() * 6.0 + 1.0;
        double dice2 = Math.random() * 6.0 + 1.0;
        System.out.println( Math.round(dice1) + Math. round(dice2) );
    }
}