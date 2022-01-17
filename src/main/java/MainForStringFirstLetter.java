public class MainForStringFirstLetter {
    public static void main(String[] args) {
        String words = "Let's see if this actually works and a c";
        getFirstLetters(words);
    }

    public static void getFirstLetters(String words) {
        words = words.trim();
        String auxString = "";
        char auxChar = ' ';
        char firstChar = words.charAt(0);
        if(Character.isLetter(firstChar)){
            System.out.println(firstChar);
        }
        for (int i = 0; i < words.length(); i++) {
            auxChar = words.charAt(i);
            if (auxChar == ' ') {
                System.out.println(words.charAt(i+1));
            }
        }
    }
}

