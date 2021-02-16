package problems.Array;

/**************
 * Step1 : Initalize top,bottom,left & right..dir=1
 * Step2 : print top row => from left->right => top++ & dir =2
 * Step3: print right column => from top to bottom => right-- & dir =3
 * Step4: print bottom row => from right to left => bottom-- & dir =4
 * Step5: print left column => from bottom to top => left++ & dir =1
 * Step6: repeat above steps until top=>bottom && left=>right is not satisfied
 **************** */
public class SpiralMatrix {
    public static void main(String args[]){
        int[][] array = {{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        spiralMatrix(array);
    }

    private static void spiralMatrix(int[][] array) {
        int rows= array.length;
        int cols= array[0].length;
        int top=0;
        int bottom=rows-1;
        int left=0;
        int right=cols-1;
        int dir =1;
        while (top<=bottom && left<=right){
            if(dir==1){
                for(int i=left;i<=right;i++){
                    System.out.print(array[top][i]+" ");
                }
                top++;
                dir=2;
            }else if(dir==2){
                for(int i=top;i<=bottom;i++){
                    System.out.print(array[i][right]+ " ");
                }
                right--;
                dir=3;
            }else if(dir==3){
                for(int i=right;i>=left;i--){
                    System.out.print(array[bottom][i]+ " ");
                }
                bottom--;
                dir=4;
            }else if(dir==4){
                for(int i=bottom;i>=top;i--){
                    System.out.print(array[i][left]+" ");
                }
                left++;
                dir=1;
            }
        }
    }
}
