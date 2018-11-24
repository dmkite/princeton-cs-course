public class FunctionGrowth{
    public static void main(String[] args){
        int n = 16;
        while (n <= 2048){
            System.out.println(n +  "\t" + Math.pow(n,2) + "\t" + Math.pow(n, 3) + "\t" + Math.pow(2, n));
            n *= 2;
            
        }
    }
}


