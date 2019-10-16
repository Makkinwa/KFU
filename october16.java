import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        task2();
    }

    private static void task1(){
        int[][] A = new int[4][3];
        Random ran = new Random();
        for (int[] arr:A)
        {
            for (int i=0; i<arr.length; i++){
                arr[i] = ran.nextInt(30);
            }
            System.out.println(Arrays.toString(arr));
        }

        int sum=0;
        for (int [] arr:A) {
            for (int tmp:arr) {
                sum+=tmp;
            }
        }
        if (sum%2==0){
            System.out.println("Сумма четная и = " + sum);
        }
        else{
            System.out.println("Сумма нечетная и = " + sum);
        }

        int sum29=0;
        int product29=1;
        for (int [] arr:A){
            for(int tmp:arr){
                if (tmp>=2 & tmp <=9){
                    sum29+=tmp;
                    product29*=tmp;
                }
            }
        }
        if(product29==1) product29=0;
        System.out.println(sum29 + " " + product29);
    }

    private static void task2(){
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int min=Integer.MAX_VALUE;
        int row=0;
        int column=0;
        int[][] A = new int[3][4];
        for (int j=0; j<A.length; j++) {
            int[] arr = A[j];
            for(int i=0; i<arr.length; i++){
                arr[i] = ran.nextInt();
                if (arr[i]<min) {
                    min=arr[i];
                    row=i+1;
                    column=j+1;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("Самое маленькое число = " + min);
        System.out.println("Оно находится в " + column + " строке и столбце " + row);
    }
}
