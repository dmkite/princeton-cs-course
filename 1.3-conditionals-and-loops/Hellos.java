public class Hellos{
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        for(int i = 0; i < num; i++){
            if( i % 100 == 11 || i % 100 == 12 || i % 100 == 13) System.out.println(i + "th Hello");
            else if(i % 10 == 1) System.out.println(i + "st Hello");
            else if( i % 10 == 2) System.out.println(i + "nd Hello");
            else if(i % 10 == 3) System.out.println(i + "rd Hello");
            else System.out.println(i + "th Hello");
            
        }
    }
}