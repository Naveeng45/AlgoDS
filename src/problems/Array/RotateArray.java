package problems.Array;

import java.util.Scanner;

public class RotateArray {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int rotatation = scanner.nextInt();
        int[] givenArray = {1,2,3,4,5};
        rotateGivenArray(rotatation,givenArray);
        int k= rotatation%givenArray.length;
        rotateGivenArrayByReverse(givenArray,0,givenArray.length-1);

    }

    private static void rotateGivenArrayByReverse(int[] givenArray, int start, int end) {
        while(start<end){
            int temp = givenArray[start];
            givenArray[start]=givenArray[end];
            givenArray[end]=temp;
            start++;
            end--;
        }
    }

    private static void rotateGivenArray(int rotatation, int[] givenArray) {
        for(int i=0;i<rotatation;i++){
            int temp=givenArray[0];
            for(int j=0;j<givenArray.length;j++){
                if(j+1< givenArray.length)
                givenArray[j]=givenArray[j+1];
            }
            givenArray[givenArray.length-1]=temp;
        }
        for (int i:givenArray
             ) {
            System.out.print(i+" ");


        }
    }
}
