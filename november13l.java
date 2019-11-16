import java.util.Scanner;

public class Runner {

    public static void main(String args[]){
         task2();
    }
    private static void task1(){
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String last = sc.next();
        String father = sc.next();
        sc.close();
        String firsttask= last + ' ' + first + ' ' + father;
        System.out.println(firsttask);
        String secondtask = last.charAt(0) + "." + first.charAt(0) + '.' + father.charAt(0);
        String thirdtask = last + "." + first.charAt(0) + '.' + father.charAt(0);
        System.out.println(secondtask);
        System.out.println(thirdtask);
    }

    private static void task2(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr =s.toCharArray();

        int z = 0;
        int Z = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]=='Z'){
                Z++;
            }
            if(arr[i]=='z'){
                z++;
            }
        }
        System.out.println("Z " + Z);
        System.out.println("z " + z);

        int numbers=0;
        for(int i=0;i<arr.length;i++){
            if( (int)arr[i]>47 & (int)arr[i]<58){
                numbers++;
            }
        }
        System.out.println("Numbers " + numbers);

        int Uppers=0;
        for(int i=0;i<arr.length;i++){
            if( (int)arr[i]>64 & (int)arr[i]<91){
                Uppers++;
            }
        }
        System.out.println("Uppers " + Uppers);

        for(int i=0;i<arr.length;i++){
            if(arr[i]=='1'){
                arr[i]=5;
            }
            if(arr[i]=='f'){
                arr[i]='F';
            }
            if(arr[i]=='a'){
                arr[i]='A';
            }
            if(arr[i]=='g'){
                arr[i]='G';
            }

        }

        System.out.println(s);



    }
    private static void task2b(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String first = s.replace("min", "max");
        String second = s.replace("ku-ku", "");
        System.out.println(first);
        System.out.println(second);
    }

    
    private static void Vasya(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] string = s.split("Вася");
        System.out.println(string[0]+"Вася");
    }
    private static void doppleZahlen() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] str = s.toCharArray();
        char[] doubles = new char[s.length()*2];
        for(int i=0, n=0; i<str.length; i++, n+=2){
            doubles[n]=str[i];
            doubles[n+1]=str[i];
            //System.out.println(doubles);
        }
        System.out.println(new String(doubles));
    }

}
