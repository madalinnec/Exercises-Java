public class MainForStringFirstLetter {
    public static void main(String[] args) {
        String words = "Let's see if this actually works and an a";
        getFirstLetters(words);
    }

    public static void getFirstLetters(String words) {
        String auxString = "";
        char auxChar = ' ';
        for (int i = 0; i < words.length(); i++) {
            auxChar = words.charAt(i);
            if (auxChar == ' ') {
                System.out.println(words.charAt(i+1));
            }
            System.out.println(auxString);
        }
    }
}

