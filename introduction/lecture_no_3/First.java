// package introduction.lecture_no_3;

public class First {
    
    //-----Find order of growth below function
    static int getSum1(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    // Answer : n


    static int getSum2(int n) {
        if(n % 2 != 0) return n;
        int sum = 0;
        for(int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    // Answer : Best Case => 1 | Average Case => n | Worst Case => n

    /*
     * 
     * Big O -> Showing exect or upper bound of order of growth
     * Theta -> Showing exect bound of order of growth
     * Omega -> Showing exect or lower bound of order of growth
     */

    public static void main(String[] args) {
        System.out.println(getSum1(10));
        System.out.println(getSum2(10));
    }
}
