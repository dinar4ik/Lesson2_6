
public class Factorial {
    int res =1;
    void factorial(int length){
        for (int i = 1; i <= length; i++) {
            res = res *i;
            
        }
        System.out.println("factorial = " +res);
    }
}
class fact{
    public static void main(String[] args) {
       new Factorial().factorial(3);
    }
}
