# BFS (다시 풀때)
from collections import deque

dx = [0,0,1,-1]
dy = [1,-1,0,0]

def valid_node(x,y):
    if x<0 or x>=M or y<0 or y>=N:
        return False
    if graph[y][x]==0:
        return False
    return True

def bfs(x,y):
    # x: 가로, y: 세로
    if graph[y][x]==0:
        return False
    
    q=deque()
    q.append((x,y))
    graph[y][x]=0
    
    while q:
        cur_x, cur_y = q.popleft()        
        for i in range(4):
            nex_x,nex_y = cur_x+dx[i],cur_y+dy[i]
            valid_node(nex_x,nex_y)
            if valid_node(nex_x,nex_y):
                q.append((nex_x,nex_y))
                graph[nex_y][nex_x]=0
    return True

test_num = int(input())
for _ in range(test_num):
    M,N,K=map(int,input().split())
    graph=[[0]*M for _ in range(N)]
    for _ in range(K):
        x,y=map(int,input().split())
        graph[y][x]=1
        
    result=0
    for i in range(M):
        for j in range(N):
            if bfs(i,j):
                result+=1
    print(result)