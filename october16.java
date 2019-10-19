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
                arr[i] = ran.nextInt(30);
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
        for (int i=0;  i<A.length; i++){
            int[] arr = A[i];
            int tmp = arr[A.length-1];
            arr[A.length-1]=arr[row];
            arr[row]=tmp;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("\n");
        for(int j=0; j<A.length; j++){
            int[] arr = A[j];
            if(j==0){

                for (int i=0; i<arr.length; i++){
                    arr[i]=min;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
    private static void task3(){
        int[][][] arr = new int[3][2][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Начало работы.Команды: Ввод, Вывод, Сумма, Массив и Стоп. ");
        String tmp;
        arr[1][1][1]=2;
        arr[2][1][3]=1;
        arr[2][1][2]=7;
        arr[0][0][2]=92;
        int x, y, z;
        while(true){
            tmp=sc.next();
            if (tmp.toLowerCase().equals("ввод")){
                System.out.println("Введи позицию числа");
                x = sc.nextInt();
                y = sc.nextInt();
                z = sc.nextInt();
                System.out.println("Запиши число");
                arr[x][y][z]=sc.nextInt();
            }
            if (tmp.toLowerCase().equals("вывод")){
                System.out.println("Введи позицию числа");
                x = sc.nextInt();
                y = sc.nextInt();
                z = sc.nextInt();
                System.out.println(arr[x][y][z]);
            }

            if (tmp.toLowerCase().equals("массив")){
                for(int[][] bigArr:arr){
                    for(int[] lilArrr:bigArr){
                        System.out.println(Arrays.toString(lilArrr));
                    }
                    System.out.println('\n');
                }
            }

            if (tmp.toLowerCase().equals("сумма")){
                int sum=0;
                for(int[][] bigArr:arr){
                    for(int[] lilArrr:bigArr){
                        for(int i=0; i < lilArrr.length; i++){
                            sum+=lilArrr[i];
                        }
                    }
                }
                System.out.println('\n');
                System.out.println(sum);
            }

            if (tmp.toLowerCase().equals("стоп")){
                break;
            }

        }

    }


}
