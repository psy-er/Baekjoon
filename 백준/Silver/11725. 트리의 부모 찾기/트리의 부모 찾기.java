import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] parent = new int[n+1]; // 각 노드의 부모 노드 저장 n+1
        
        ArrayList<Integer>[] adj = new ArrayList[n+1]; // 연결 리스트 배열
        for(int i = 1; i <= n; i++){
            adj[i] = new ArrayList<>();
        }
        
        boolean[] visited = new boolean[n+1]; // 방문 체크
        
        StringTokenizer st;
        for(int i = 1; i< n; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a].add(b); // 연결 리스트 배열에 저장
            adj[b].add(a); // 연결 리스트 배열에 저장
        }
        
        Queue<Integer> queue = new LinkedList<>(); // BFS를 위한 큐
        queue.add(1); // 루트 노드 1을 큐에 넣고 방문 처리함
        visited[1] = true;
        
        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(int next : adj[cur]){
                if(visited[next]){ // 이미 방문했던 노드면 건너뛰기
                    continue;
                }
                visited[next] = true;
                queue.add(next);
                parent[next] = cur;
            }
        }
        
        for(int i = 2; i<= n; i++){
            System.out.println(parent[i]);
        }  
    }
}