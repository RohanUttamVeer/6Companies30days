import java.util.*;

public class AnagramsStr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];

        for (int i = 0; i < n; i++)
            str[i] = sc.nextLine();

        anagramsString(str);
    }
}
