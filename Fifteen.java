public class Main {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence.";
        String modifiedSentence = replaceFirstLetter(sentence);
        System.out.println(modifiedSentence); 
    }
    public static String replaceFirstLetter(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder modifiedSentence = new StringBuilder();
        for (String word : words) {
            if (word.length() > 1) {
                modifiedSentence.append(word.substring(1));
            } else {
                modifiedSentence.append(word);
            }
            modifiedSentence.append(" ");
        }
        return modifiedSentence.toString().trim();
    }
}
