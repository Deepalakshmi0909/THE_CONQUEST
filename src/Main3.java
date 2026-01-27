import java.util.Scanner;
public class Main3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int a=input.nextInt();
        int b=input.nextInt();

        if(a>b){
            System.out.println("a big");
        }
        else{
            System.out.println("b big");
        }

    }

}
