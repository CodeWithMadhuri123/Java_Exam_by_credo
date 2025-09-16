public class SwapWithTemp {
    public static void main (String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swap: a =" + a +", b= "+b);
        //Swap using third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a =" + a + ", b = "+b);
    }
}
