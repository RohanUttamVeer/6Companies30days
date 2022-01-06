import java.util.*;

public class AnagramsStr {
//O(n) tc
    public static void anagramsString(String arr[]) {
        HashMap<String, List<String>> map = new HashMap<>();
        // List<List<String>> values = new ArrayList<List<String>>();
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);

            if (map.containsKey(newWord)) {
                map.get(newWord).add(word);
            } else {
                List<String> words = new ArrayList<>();
                words.add(word);
                map.put(newWord, words);
            }
        }
        for (String s : map.keySet()) {
            List<String> values = map.get(s);
            if (values.size() > 0) {
                System.out.print(values);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str[] = new String[n];

        for (int i = 0; i < n; i++)
            str[i] = scanner.next();

        anagramsString(str);
    }
}
