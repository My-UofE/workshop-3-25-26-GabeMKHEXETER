// Add your code below
public class DemoIncrement {
    public static void main(String[] args) {
        // Demonstration of the increment operator
        int a = 3;
        int b = a++ + 5;
        int x = 3;
        int y = ++x + 5;
        int p = 3;
        ++p; //4
        int q = p + 5; //9

        /*System.out.print("a: " + a); //3 (actual: 3)
        System.out.print(", b: " + b); //9 (actual: 8)
        System.out.print(", x: " + x); //4
        System.out.println(", y: " + y); //9 */
        System.out.println("a: " + a + ", b: " + b + ", x: " + x + ", y: " + y + ", p: " + p + ", q: " + q);

        // Replace the xxxxx in the following with the correct term
        System.out.println("i++ means pre-increment");
        System.out.println("++i means post-increment");
    }
}
