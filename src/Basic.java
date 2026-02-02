public class Basic {
    public static void main(String[]args){
        //Basic 1
        /*int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/
        //output
        //*
        //* *
        //* * *
        //* * * *
        //* * * * *


        //Basic 2
        /*int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        //output
        //*****
        //****
        //***
        //**
        //*

// Using increasing triangle and decreasing triangle can make :
// 1
        /*int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        //output
        // *****
        //  ****
        //   ***
        //    **
        //     *


//2
        /*int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        //output
        //     *
        //    **
        //   ***
        //  ****
        // *****

//3

        /*int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        //     *
        //    ***
        //   *****
        //  *******
        // *********

 //4

        /*int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<n;j++){
                System.out.print("*");
            }
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //output
        // *********
        //  *******
        //   *****
        //    ***
        //     *

//5

//Floyd Triangle
        /*int n=4,p=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
        }*/
        //output
        //1
        //2 3
        //4 5 6
        //7 8 9 10

        int n=4,p=1;
        int num;
        for(int i=1;i<=n;i++){
            num=(i*(i+1))/2;

            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(num-- +" ");
            }

            System.out.println();

        }

        for(int i=1;i<=n;i++){
            num=10;

            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(num +" ");
                num--;
            }

            System.out.println();
        }
    }
}
