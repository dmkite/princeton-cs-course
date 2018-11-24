public class MakingChange{
    public static void main(String[] args){
        int numPennies = Integer.parseInt(args[0]);
        int Q = 0;
        int D = 0;
        int N = 0;
        while (numPennies > 4){
            if(numPennies - 25 >= 0){
                Q++;
                numPennies -= 25;
            }
            else if(numPennies - 10 >= 0 ){
                D++;
                numPennies -= 10;
            }
            else if(numPennies - 5 >= 0){
                N++;
                numPennies -= 5;
            }
        }
        System.out.println(Q  + " Quarters, " + D + " Dimes, " + N + " Nickels, " + numPennies + " Pennies");
        
    }
}