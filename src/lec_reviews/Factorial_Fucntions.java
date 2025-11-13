package lec_reviews;

public class Factorial_Fucntions {
    public static void main(String[] args) {

    }

    public static long factorial1(int n)
    {
        if(n==0) return 1;
        long factorial = 1;
        for (int i = 1; i <= n; i++)
            {
            factorial *= i;
            }
        return factorial;
    }
}
