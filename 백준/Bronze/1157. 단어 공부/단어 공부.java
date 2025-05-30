import java.util.Scanner;

public class Main {
    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                count[ch - 'A']++;
            } else if(ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] count = getAlphabetCount(str);

        int maxCount = -1;
        char maxAlphabet = '?';
        for(int i = 0; i < 26; i++) {
            if(count[i] > maxCount) {
                maxCount = count[i];
                maxAlphabet = (char)('A' + i);
            }
            else if(count[i] == maxCount) {
                maxAlphabet = '?';
            }
        }
        System.out.println(maxAlphabet);
    }
}




