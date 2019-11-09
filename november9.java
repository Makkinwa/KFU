import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Поехали!");
        System.out.println(Arrays.toString(strangeSort(genArr(1))));
        luckyTicket(sixArr(1000));
    }
    static Random r = new Random();
    private static int[] genArr(int n){
        int[] arr = new int[n];

        for (int i=0; i<arr.length; i++) {
            arr[i]=r.nextInt(100);
        }
        return arr;
    }

    private static int[] inputArr(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько элементов?");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<arr.length;i++ ){
            System.out.println("Введи элемент №" + i);
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    private static int[] strangeSort(int[] arr){
        System.out.println(Arrays.toString(arr));
        int index=0;
        while(index!=arr.length){
            for(int i=index; i<arr.length; i++){
                if(index%2==0){
                    if(i%2==0 & arr[i]<arr[index]){
                        int tmp=arr[index];
                        arr[index]=arr[i];
                        arr[i]=tmp;
                    }
                }
                else {
                    if(i%2!=0 & arr[i]>arr[index]){
                        int tmp=arr[index];
                        arr[index]=arr[i];
                        arr[i]=tmp;
                    }
                }

            }
            index++;
        }

        return arr;
    }

    private static int[] sixArr(int n){
        int[] arr = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i]=r.nextInt(900000) + 100000;
        }
        return arr;
    }

    private static void luckyTicket(int[] arr){
        for (int i=0;i<arr.length; i++){
            int sum1=arr[i]%1000;
            int sum2=arr[i]/1000;
            if(sum1==sum2){
                System.out.println("Билет №" + i+ " счастливый!");
            }

        }
    }


}
