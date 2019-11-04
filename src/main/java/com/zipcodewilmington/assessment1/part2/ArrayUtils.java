package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int counter = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == (objectToCount)) {
                counter++;
            }
        }
        return counter;
    }
    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        //Made an array list
        ArrayList<Object> outputArrayL = new ArrayList<Object>();
        // added the 'previous' 1st element of the input
        outputArrayL.add(objectArray[0]);
        // starting at index 1; index going til end of the array; increment by 1;
        for (int x = 1; x < objectArray.length; x++) {
            // if array of index is not equal to array of index 'previous'(-1), than add it to the array list.
            if (objectArray[x] != objectArray[x - 1]) {
                outputArrayL.add(objectArray[x]);
            }

        }
        // Initializing new Object[] to the size of outputArrayL
        Object[] output = new Object[outputArrayL.size()];
        // Converting outputArrayL to normal array of type Object
        return outputArrayL.toArray(output);
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        // declare variables needed
         int counter =  0;
         int counterTemp = 0;
         Object highest = 0;

         // inner loop checks for highest number before outer loop goes thru
         for (int i = 0 ; i < objectArray.length -1 ; i ++ ) {
             for (int j = 0; j < objectArray.length -1; j++) {
                 if (objectArray[i] == objectArray[j]){
                     counterTemp++;
                 }
                 // after inner loop checks for MC num,
                 if(counterTemp > counter){
                     counter = counterTemp;
                     counterTemp = 0;
                     highest = objectArray[i];
                 }

             }
         }
        return highest;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        // declare variables needed
        int counter =  0;
        int counterTemp = 0;
        Object least = 0;

        // inner loop checks for highest number before outer loop goes thru
        for (int i = 0 ; i < objectArray.length -1 ; i ++ ) {
            for (int j = 0; j < objectArray.length -1; j++) {
                if (objectArray[i] != objectArray[j]){
                    counterTemp++;
                }
                // after inner loop checks for LC num,
                if(counterTemp > counter){
                    counter = counterTemp;
                    counterTemp = 0;
                    least = objectArray[i];
                }

            }
        }
        return least;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        return null;
    }
}
