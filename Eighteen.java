public class Main {

    public static void main(String[] args) {
        String s = "Hello all this is a 1234569!&*^ in a life of $%#**";
        int totalChars = s.length();

        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        int numberCount = 0;
        int specialCharCount = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else if (!Character.isWhitespace(ch)) {
                specialCharCount++;
            }
        }

        double upperCasePercentage = ((double) upperCaseCount / totalChars) * 100;
        double lowerCasePercentage = ((double) lowerCaseCount / totalChars) * 100;
        double vowelPercentage = ((double) vowelCount / totalChars) * 100;
        double consonantPercentage = ((double) consonantCount / totalChars) * 100;
        double numberPercentage = ((double) numberCount / totalChars) * 100;
        double specialCharPercentage = ((double) specialCharCount / totalChars) * 100;

        System.out.println("Uppercase percentage: " + upperCasePercentage + "%");
        System.out.println("Lowercase percentage: " + lowerCasePercentage + "%");
        System.out.println("Vowel percentage: " + vowelPercentage + "%");
        System.out.println("Consonant percentage: " + consonantPercentage + "%");
        System.out.println("Number percentage: " + numberPercentage + "%");
        System.out.println("Special character percentage: " + specialCharPercentage + "%");
    }
}

