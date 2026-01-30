public class PrintPattern1{
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]); //input
        if (num > 0){
            for (int i = 0; i < (num+1); i++){
                System.out.println("");
                for (int j = 1; j<i+1; j++){    
                    System.out.print(j);
                }
            }
        }
    }
}