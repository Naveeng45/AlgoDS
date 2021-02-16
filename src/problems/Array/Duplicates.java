package problems.Array;

import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.Set;

/***
 * Print duplicates in an array
 *
 * Set is an unordered container which wouldnt accept duplicates
 * Set is an interface which has implementations classes as LinkedHashset,hashset,treeset
 */
public class Duplicates {
    public static void main(String args[]){
        int[] givenArray = {1,2,2,4,5,6,8,9};
        int[] givenArrayll = {1,1,1,2,2,3,3,3,4};
        int[] withZeros = {0,1,0,3,12};
        printDuplicate(givenArray);
        System.out.println(removeDuplicates(givenArray));
        System.out.println(removeDuplicatesll(givenArrayll));
        System.out.println(removeElement(givenArray,2));
        moveZeros(withZeros);
    }

    private static void moveZeros(int[] withZeros) {
        int i=0,j=0;
        while(j<withZeros.length){
            if(withZeros[j] != 0){
                withZeros[i] = withZeros[j];
                withZeros[j] = 0;
                i++;
            }
            j++;
        }
        for (int key:withZeros) {
            System.out.print(key+",");
        }
    }

    private static int removeElement(int @NotNull [] givenArray , int ele){
        int i=0,j=0;
        while(j<givenArray.length){
            if(givenArray[j] != ele){
                givenArray[i]=givenArray[j];
                i++;

            }
            j++;
        }
        for (int key:givenArray) {
            System.out.print(key);
        }
        return i;
    }

    private static int removeDuplicatesll(int[] givenArrayll) {
        if(givenArrayll.length<=2){
            return givenArrayll.length;
        }
        int i =1,j=2;
        while(j<givenArrayll.length){
            if(givenArrayll[i] == givenArrayll[j] && givenArrayll[i-1] == givenArrayll[j]){

                j++;
            }else{
                i++;
                givenArrayll[i] = givenArrayll[j];
                System.out.print(givenArrayll[i]);

                j++;
            }
        }
        return i++;
    }

    private static void printDuplicate(int[] givenArray) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        boolean isUniqueArray = false;
        for(int i=0;i< givenArray.length;i++){
            if(uniqueNumbers.contains(givenArray[i])){
                isUniqueArray=true;
                System.out.println(givenArray[i]);
                break;
            }else{
                uniqueNumbers.add(givenArray[i]);
            }
        }

    }

    private static int removeDuplicates(int[] givenArray){
        if(givenArray == null){
            return 0;
        }
        if(givenArray.length<2){
            return givenArray.length;
        }
        int i=0,j=1;
        while(j<givenArray.length){
            if(givenArray[i] != givenArray[j]){
                i++;
                givenArray[i]=givenArray[j];
                System.out.print(givenArray[i]);
            }
            j++;

        }
        return i+1;
    }
}
