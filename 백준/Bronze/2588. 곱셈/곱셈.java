import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();

        // 결과 출력
        System.out.println(A * (B%10)); // 1의 자리 곱셈
        System.out.println(A * (B%100/10)); // 10의 자리 곱셈
        System.out.println(A * (B/100)); // 100의 자리 곱셈
        System.out.println(A * B); // 전체 값 곱셈
    }
}