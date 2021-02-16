package problems.Array;

public class Order_stat {
    public static void main(String args[]){
        int[] arr = {4,9,8,2,5,1,0};
        int min2=getMin2(arr);
        System.out.println(min2);
    }
    public static int getMin2(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int min=0,min2 = 0;
        if(arr.length==1){
            min2=arr[0];
        }else if(arr.length>=2){
            if(arr[0]<=arr[1]){
                min=arr[0];
                min2=arr[1];
            }else{
                min=arr[1];
                min2=arr[0];
            }
        }
        if(arr.length>=3){
            for(int i=2;i< arr.length;i++){
                if(arr[i]<min){
                    min2=min;
                    min=arr[i];
                }else if(arr[i]<min2){
                    min2=arr[i];
                }
            }
        }
        return min2;

    }
}
