;public class Clock{
    public static void main(String[] args){
        for(int i = 0; i <= 24; i++){
            if(i == 0 || i == 24) System.out.println("12 midnight");
            else if ( i < 12) System.out.println(i + "am");
            else if ( i == 12) System.out.println("12 noon");
            else System.out.println(i - 12 + "pm");
        }
    }
}