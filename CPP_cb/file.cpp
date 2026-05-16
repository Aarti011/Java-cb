#include <iostream>
#include<cstring>
using namespace std;

void func(char *s, int i){
    if(s[i]=='\0'){
        cout<<s<<" "<<endl;
        return;
    }
    for(int j=i; s[j];j++){
    swap(s[i],s[j]);
    func(s,i+1);
    swap(s[i],s[j]);
    }
}
int main(){
    // freopen("input.txt", "r", stdin); 
    // freopen("output.txt","w",stdout);
    
    char s[]="abc";
    func(s, 0);
    return 0;
}