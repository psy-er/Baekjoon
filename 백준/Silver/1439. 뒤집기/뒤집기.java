import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        char[] arr = s.toCharArray();
        int zero = 0, one = 0, cnt = 0;
        
        char tmp = arr[0];
        if(arr[0] == '0'){
            zero++;
        }
        else{
            one++;
        }
        
        for(int i=1; i<arr.length ; i++){
            if(arr[i-1] != arr[i]){
                if(arr[i] == '0'){
                    zero++;
                }
                if(arr[i] == '1'){
                    one++;
                }
            }
        }
        System.out.println(Math.min(zero, one));
        
    }
}