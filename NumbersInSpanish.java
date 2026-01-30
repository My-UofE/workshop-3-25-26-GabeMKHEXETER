public class NumbersInSpanish {
    public static void main(String[] args) {
       // read the first argument passed to the program
       int number = Integer.parseInt(args[0]); 
       String numSpan = (number==1)?"uno":(number==2)?"dos":(number==3)?"tres":(number==4)?"quatro":(number==5)?"cinco":"Sorry I can't count past 5! :c";
       switch(number){
        case 1:
            System.out.print(number+": uno");
            break; //IMPORTANT
        case 2:
            System.out.print(number+": dos");
            break; //IMPORTANT
        case 3:
            System.out.print(number+": tres");
            break; //IMPORTANT
        case 4:
            System.out.print(number+": quatro");
            break; //IMPORTANT
        case 5:
            System.out.print(number+": cinco");
            break; //IMPORTANT
        default:
            System.out.print(number+": Sorry I can't count past 5! :c");
            break; //IMPORTANT
       }
        System.out.println(number+":"+numSpan);
    }
 }