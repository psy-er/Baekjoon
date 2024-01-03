import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int[][] APT = new int[15][15];
        
        for(int i = 0; i< 15; i++){ // 기초 뼈대 만들기
            APT[i][1] = 1; // 1호 1로 채우기
            APT[0][i] = i; // 0층 i호 i로 채우기
        }
        
        for(int i = 1; i<15; i++){
            for(int j = 2; j<15; j++){
                APT[i][j] = APT[i][j-1] + APT[i-1][j];
            }
        }
        
        int T = in.nextInt();
        for(int i=0; i<T; i++){
            int k = in.nextInt();
            int n = in.nextInt();
            System.out.println(APT[k][n]);
        }
    }
    
}