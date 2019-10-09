import java.util.Scanner;

public class Runner {

    public static void main(String args[]){
        System.out.println("Start");
        task4();
    }

    private static void task1() {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("A." + arr[1] + "  " + arr[8]);
        System.out.println("B. ");
        for (int j=0; j < 10; j+=2){
            System.out.println(arr[j]);
        }
        System.out.println("C. ");
        int sum=0;
        for (int tmp : arr){
            sum+=tmp;
        }
        System.out.println("Sum = " + sum);
    }

    private static void task2() {
        double[] arr=new double [7];
        for(int i=0; i<7; i++){
            arr[i]= i*i +  Math.cos((-Math.PI/3)+i);
        }
        for (double tmp:arr){
            System.out.println(tmp);
        }
    }

    private static void task3(){
        int[] arr=new int[15];
        arr[0]=0;
        arr[1]=1;
        for(int i=2; i <15; i++){
            arr[i] = arr[i-2] + arr[i-1];
        }
        for(int tmp:arr){
            System.out.println(tmp);
        }
    }

    private static void task4() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        System.out.println("Вводи буквы через пробел");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        for (char tmp : arr) {
            System.out.print(tmp + " ");
        }
        System.out.println(" ");
        for (int i = arr.length; i > 0; i--) {
            System.out.print(arr[i-1]);
        }
        System.out.println(" ");
        if(arr.length%2==0){
            for (int i=arr.length/2)
        }
    }


}
