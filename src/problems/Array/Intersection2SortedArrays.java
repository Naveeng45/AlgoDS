package problems.Array;

/***********************
 *
 * givenArray1 : 1,2,3,5,7,9
 * givenArray2 : 3,4,,5,8,10
 *
 * Inntersection : 1,2,3,4,5,7,8,9,10
 * Union : 3,5
 *
 *
 */
public class Intersection2SortedArrays {
    public static void main(String args[]) {
        int[] givenArray1 = {1,2,3,5,7,9};
        int[] givenArray2 = {3,4,5,8,10};
        printIntersection(givenArray1,givenArray2);
        printUnion(givenArray1,givenArray2);
    }

    private static void printUnion(int[] givenArray1, int[] givenArray2) {
        int i=0,j=0;
        System.out.println("Union Set :");
        while(i< givenArray1.length && j< givenArray2.length){
            if(givenArray1[i]<givenArray2[j])
            {
                i++;
            }
            else if(givenArray1[i]>givenArray2[j]){
                j++;
            }
            else if(givenArray1[i]==givenArray2[j]){
                System.out.print(givenArray1[i]+" ");
                i++;
                j++;
            }

        }
    }

    private static void printIntersection(int[] givenArray1, int[] givenArray2) {
        System.out.println("Intersection of sorted Arrays :");
        int i=0,j=0;
        while(i<givenArray1.length && j<givenArray2.length){
            if(givenArray1[i]<givenArray2[j]){
                System.out.print(givenArray1[i] + " ");
                i++;
            }else if(givenArray2[j]<givenArray1[i]){
                System.out.print(givenArray2[j++]+ " ");
            }else if(givenArray1[i]==givenArray2[j]){
                System.out.print(givenArray1[i++]+ " ");
                j++;
            }

        }
        while(i< givenArray1.length){
            System.out.print(givenArray1[i++]+ " ");
        }
        while(j<givenArray2.length){
            System.out.print(givenArray2[j++]+ " ");

        }
        System.out.println();
    }


}
