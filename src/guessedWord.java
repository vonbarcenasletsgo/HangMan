public class guessedWord {
    public static String guessedString(char x, char[] orig, String currentGuesses){
        StringBuilder tempString = new StringBuilder(currentGuesses);

        for(int i = 0; i < orig.length; i++){
            if(x == orig[i]){
                tempString.setCharAt(i, x);
            }
        }

        return tempString.toString();
    }
}
