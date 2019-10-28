package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int startFact = 1;
        for (int i = 2; i <= n; i++){
            startFact = startFact + (i);}
        return startFact;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int startFact = 1;
        for (int i = 2; i <= n; i++){
            startFact = startFact * (i);}
        return startFact;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        int temp = 0;
        int count = 0;

        while(val != 0)
        {
            if(val%10 == 0)count++;
            temp = temp*10 + val %10;
            val /= 10;
        }
        for(int i = 0; i < count; i++){
        }
        return temp;

    }

}