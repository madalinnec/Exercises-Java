package exercises;

public class MainForStringPalindrome {
    public static void main(String[] args) {
        String string = "aba";
        checkIfPalindrome(string);
    }

    public static void checkIfPalindrome(String string) {
        String reversedString ="";
        boolean palindrome = false;
        char aux;
        for (int i = string.length() - 1; i >= 0; i--) {
            reversedString += string.charAt(i);
        }
        if(string.equals(reversedString)){
            palindrome =  true;
            System.out.println(palindrome);
        }else{
            System.out.println(palindrome);
        }
    }
}

