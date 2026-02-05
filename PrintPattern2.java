public class PrintPattern2{
    //user input (1 - 5) 
    //pascals triangle looking..something
    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        if (num < 1 || num > 5){ //if not in the barrier
            System.out.println("Sorryy, rerun and pick a new value! :(");
        }
        else{
            //I'm really lost with how to make this into a for loop, if im honest..
            //did my best but i really don't know ( . m.)
            for (int i = 0; i < num; i++){
                for (int j = 0; j < num; j++){
                    int value = num - Math.abs(num - 1 - (i + j));
                    System.out.print(value + "");
                }
                System.out.println();
            }
            for (int i = num; i > 0; i--){
                for (int j = num; j > 0 ; j--){
                    int value = num - Math.abs(num - 1 - (i + j));
                    System.out.print(value + "");
                }
                System.out.println();
            }
        }
    }

}