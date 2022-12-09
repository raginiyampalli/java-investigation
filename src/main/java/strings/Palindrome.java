package strings;

/**
 * Check if a given string is a palindrome .
 */
public class Palindrome {

    /**
     * This method uses inbuilt methods
     */
    public static boolean isPalindrome(String input){
        if(input==null)
            return false;

        if(input.isEmpty())
            return true;

        StringBuffer stringBuffer = new StringBuffer(input);
        stringBuffer.reverse();
        String reversedInput = stringBuffer.toString();

        return reversedInput.equals(input);
    }

    public static void main(String args[]){
        System.out.println("Hello is a palindrome :" + isPalindrome("Hello") );
        System.out.println("saippuakivikauppias is a palindrome :" + isPalindrome("saippuakivikauppias") );
    }

}
