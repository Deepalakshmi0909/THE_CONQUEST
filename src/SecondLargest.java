package Zoho;

public class SecondLargest {
    public static void main(String[]args){
        int[] arr1={4,6,5,1,2};
        int[] arr2={5,5};
        int[] arr3={5,5,4};
        int[] arr4={9};
        int[] arr5={-1,-2,-3,10,10};
        int[] arr7={};

        System.out.println(findSecond(arr1));
        System.out.println(findSecond(arr2));
        System.out.println(findSecond(arr3));
        System.out.println(findSecond(arr4));
        System.out.println(findSecond(arr5));
        System.out.println(findSecond(arr7));


    }

    private static int findSecond(int[]arr){
        if(arr.length==0 || arr.length==1) return -1;
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int num:arr){
            if(max<num){
                secondmax=max;
                max=num;
            }else if(secondmax <num  &&  max!=num){
                secondmax=num;

            }
        }
        if(secondmax==Integer.MIN_VALUE) return max;
        return secondmax;
    }


}
