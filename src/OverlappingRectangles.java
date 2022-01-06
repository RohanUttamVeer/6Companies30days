import java.util.Scanner;

public class OverlappingRectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L1[] = new int[2];
        int R1[] = new int[2];
        int L2[] = new int[2];
        int R2[] = new int[2];
        L1[0] = sc.nextInt();
        L1[1] = sc.nextInt();
        R1[0] = sc.nextInt();
        R1[1] = sc.nextInt();
        L2[0] = sc.nextInt();
        L2[1] = sc.nextInt();
        R2[0] = sc.nextInt();
        R2[1] = sc.nextInt();

        int ans = overlapRec(L1, R1, L2, R2);
        System.out.println(ans);
    }

    static int overlapRec(int[] L1, int[] R1, int[] L2, int[] R2) {
        // if the rectangles are on the sides
        if (L1[0] > R2[0] || L2[0] > R1[0])
            return 0;
            // if the rectangles are on one another
        if (L1[1] < R2[1] || L2[1] < R1[1])
            return 0;

        return 1;

    }
}
