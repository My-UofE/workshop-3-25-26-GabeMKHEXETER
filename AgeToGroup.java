public class AgeToGroup{
    //boolean operations and stuff :>
     public static void main(String[] args) { //originally forgor this part when using examples aaaaa
        int age = Integer.parseInt(args[0]); //input 

        /*int ageGroup = 1; //everybody else 
        if (age<=18) //baby age group
            ageGroup = 0;
        
        if (age>=65) //old age group
            ageGroup = 2;   */

        int ageGroup = (age<=18)?0:(age>=65)?2:1 //ternary operation for if statements :>   
            
        System.out.println("Age: " + age + ", Age Group: " + ageGroup);
    }
}