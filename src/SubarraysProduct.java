import java.util.Scanner;

public class SubarraysProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long a[] = new long[(int) (n)];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        Solution obj = new Solution();
        System.out.println(obj.countSubArrayProductLessThanK(a, n, k));
    }
}

class Solution {

    public long countSubArrayProductLessThanK(long a[], long n, long k) {
        long count = 0;
        int i, j;
        long mul;

        for (i = 0; i < n; i++) {
            if (a[i] < k)
                count++;
            mul = a[i];
            for (j = i + 1; j < n; j++) {
                mul = mul * a[j];
                if (mul < k)
                    count++;
                else
                    break;
            }
        }
        return count;
    }
}