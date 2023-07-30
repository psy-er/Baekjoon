#include <iostream>
using namespace std;

int main(){

    int N = 1;
    int n = 0;
    int a[2000] = {};
    int b[2000] = {};

    cin>>N;

    for(int i = 0;i < N;i++){
        cin>> n;
        if (n > 0){
            a[n]++;
        }
        if(n < 0){
            b[-n]++;
        }
        if(n == 0){
            a[n]++;
        }
    }

    for (int k = 1000;k > 0;k--){

        if (b[k] > 0){
            cout<<-k<<endl;
        }
    }

    for(int j = 0;j < 1001;j++){
        if (a[j] > 0){
            cout<<j<<endl;
        }
    }


    return 0;
}