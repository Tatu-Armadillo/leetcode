public class PalindromeNumber {

    public static void main(String[] args) {

        var x = isPalindrome(121);
        System.out.println(x);

    }

    public static boolean isPalindrome(int x) {
        final String[] word = (x + "").split("");
        final String[] newWord = new String[word.length];

        int length = word.length - 1;

        for (int i = 0; i < word.length; i++) {
            newWord[length] = word[i];
            if (!newWord[length].equals(word[length])) {
                return false;
            }
            length--;
        }

        return true;
    }

}
