/*
    Miles Basnillo
    6/15/17
    Prints all Prime && Palindromic numbers from 1 to N where N is the input of the user

    ***NOTES***
    -Stops at 98689, largest number before 1,000,000.
*/

import java.util.*;

public class PrimePalindrome{
    public static void main(String args[]){
        System.out.print("Enter a number: ");
        int number;

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        for(int i=1; i<=number; i++){
            if(!(checkPrime(i))) continue;
            if(!(checkPalindrome(i))) continue;
            System.out.println(i);
        }
    }

    public static boolean checkPrime(int num){
        int half = num/2;
        for(int i=2; i<=half; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean checkPalindrome(int num){
        String s = Integer.toString(num);
        for(int i=0, j=s.length()-1; i<=s.length()/2; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
