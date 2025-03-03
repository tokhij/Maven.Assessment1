package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String strOut = str.substring(0, 1).toUpperCase() + str.substring(1);
        return strOut;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        //return new StringBuilder(str).reverse().toString();
        String randomWords = "";
        char[] randomChar = str.toCharArray();

        for (int i = randomChar.length-1; i>=0; i--){
            randomWords += randomChar[i];
        }
        return randomWords;
    }


    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        // how to call on methods
        String reversing = reverse(str);

//        String stringBuilder = new StringBuilder(str).reverse().toString();
        String camel = camelCase(reversing);

//        String strOut = stringBuilder.substring(0, 1).toUpperCase() + stringBuilder.substring(1);
//        {
//            return strOut;
//        }
        return camel;
    }

    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1,str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) 
    {
        char[] charsInput = str.toCharArray();
        for (int i = 0; i < charsInput.length; i++)
        {
            char c = charsInput[i];
            if (Character.isUpperCase(c))
            {
                charsInput[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c))
            {
                charsInput[i] = Character.toUpperCase(c);
            }
        }
        return new String(charsInput);
    }




}