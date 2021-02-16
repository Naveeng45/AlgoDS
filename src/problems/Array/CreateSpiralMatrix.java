package problems.Array;

import java.lang.reflect.Array;

public class CreateSpiralMatrix {
    public static void main(String args[]){
        int row=4,col=4;
        int array[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int[][] outArray = new int[row][col];
        createSpiralMatrix(array,outArray);
    }

    private static void createSpiralMatrix(int[] array, int[][] outArray) {
        int row = outArray.length;
        int col = outArray[0].length;
        int top = 0;
        int bottom = row-1;
        int left = 0;
        int right= col-1;
        int dir =1;
        int index=0;
        while(top<=bottom && left<=right){
            if(dir==1){
                for(int i=left;i<=right;i++){
                    outArray[top][i] = array[index++];
                }
                top++;
                dir=2;
            }else if(dir ==2){
                for(int i=top;i<=bottom;i++){
                    outArray[i][right]=array[index++];
                }
                right--;
                dir=3;
            }else if(dir==3){
                for(int i=right;i>=left;i--){
                    outArray[bottom][i]=array[index++];
                }
                bottom--;
                dir=4;
            }else if(dir==4){
                for(int i=bottom;i>=top;i--){
                    outArray[i][left]=array[index++];
                }
                left++;
                dir=1;
            }

        }
        //print outArray
        for(int i=0;i<outArray.length;i++){
            for(int j=0;j<outArray[i].length;j++){
                System.out.print(outArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
