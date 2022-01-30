package chapter8;

public class NumberOfWordsInaString {
    public static void main(String args[]){
        countWords("Java is a beautiful language");
    }

    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

        for(int i=0; i<message.length();i++ ){
            System.out.println(words[i]);

        }
    }
}
