public class GuessChecker {
    public static boolean checker(char guess, char[] orig){
        for(int x = 0; x < orig.length; x++){
            if(guess == orig[x]) {
                return true;
            }
        }
        return false;
    }
/*
    public static int indexChecker(char guess, char[] orig){ //since checker method cannot return two values at once, this returns the index of where the number was found
        int index = -1;

        for(int x = 0; x < orig.length; x++){
            if(guess == orig[x]) {
                index = x;
                break;
            }
        }
        return index;
    }
    */
}
