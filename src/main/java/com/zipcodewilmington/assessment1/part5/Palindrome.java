package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer palinStringChars = input.length();
        Integer numOfPalins = 0;
        for (int mid = 0; mid <= 2 * palinStringChars-1; mid++) {
            int left = mid/2;
            int right = left + mid %2;
        while(left >= 0 && right < palinStringChars && input.charAt(left) == input.charAt(right)){
            numOfPalins++;

            left--;
            right++;
        }
        }

        return numOfPalins;
    }
}
