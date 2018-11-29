public class MaxMin{
    public static void main(String[] args){
        int[] nums = new int[args.length];
        int max = 0;
        int min = (int) Double.POSITIVE_INFINITY;
        for(int i = 0; i < args.length; i++){
           nums[i] = Integer.parseInt(args[i] );
           if(nums[i] < min) min = nums[i];
           if(nums[i] > max) max = nums[i];
        }

        System.out.println("The max is " + max + " and the min is " + min);
    }
}