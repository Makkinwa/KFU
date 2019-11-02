import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Поехали!");
        int[] arr = {-2, -3, -4, -4};
        System.out.println(task1c(arr, 4));
    }

    private static boolean task1a(int[] arr){
        if(arr[arr.length-1]>0){
            return task1a(Arrays.copyOf(arr, arr.length-1));
        }
        else {
            if(arr.length == 0){
                return false;
            } else return true;
        }
    }

    private static boolean task1b(int[] arr){
        if(arr[arr.length-1]>0){
            return task1b(Arrays.copyOf(arr, arr.length-1));
        }
        else {
            if(arr.length == 0){
                return true;
            } else return false;
        }
    }

    private static boolean task1c(int[] arr, int n){
        if(arr.length>=2 & arr[arr.length-1]!=n){
            return task1c(Arrays.copyOf(arr, arr.length-1), n);
        }
        else {
            if(arr.length == 1){
                return false;
            } else return true;
        }
    }
}
