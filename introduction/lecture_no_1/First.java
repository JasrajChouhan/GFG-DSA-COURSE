//------ Given number n , find the sum of first natural number n

import java.util.Scanner;

public class First {

    // TC : O(n) 
    // SC : O(1) 
    static int findSumByIterationMethod(int n) {
        int resultSum = 0;
        for(int i = 1; i <= n; i++) resultSum += i;
        return resultSum ;
    }

    // TC : O(n) 
    // SC : O(n) 
    static int findSumByRecursionMethod(int n) {
        return n == 0 ? 0 : n + findSumByRecursionMethod(n - 1) ;
    }

    // TC : O(1) 
    // SC : O(1) 
    static int findSumByFarmulla(int n) {
        return (n * (n + 1)) / 2 ;
    }

    // TC : O(n ^ 2) 
    // SC : O(1)
    static int findSumByUsingTwoLoop(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) sum++;
        }

        return sum ;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(findSumByIterationMethod(n));
        System.out.println(findSumByRecursionMethod(n));
        System.out.println(findSumByFarmulla(n));
        System.out.println(findSumByUsingTwoLoop(n));

        sc.close();
    }
}