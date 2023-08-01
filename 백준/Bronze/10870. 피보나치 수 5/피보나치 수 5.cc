#include <stdio.h>

int Fi(int n){
    if(n==1)
        return 0;
    else if (n==2)
        return 1;
    else
        return Fi(n-1) + Fi(n-2);
}

int main(){
    int a;
    scanf("%d",&a);
    printf("%d",Fi(a+1));
    
    return 0;
}