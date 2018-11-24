public class RollLoadedDie{
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,6,6};
        int roll = (int) Math.floor(Math.random() * 8);
        int x = roll;
        System.out.println(nums[x]);
    }
}