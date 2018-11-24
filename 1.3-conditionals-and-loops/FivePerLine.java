public class FivePerLine{
    public static void main(String[] args){
        for(int i = 1000; i <= 2000; i++){
            if(i % 5 == 0){
                System.out.println(i + ", ");
                continue;
            } 
            System.out.print(i + ", ");
        }
        
    }
}