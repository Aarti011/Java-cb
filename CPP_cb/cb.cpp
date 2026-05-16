// #include <iostream>
// #include<cstring>
// using namespace std;

// void func(string s, int i){
//     if(s[i]=='\0'){
//         cout<<s<<" "<<endl;
//         return;
        
//     }
//     for(int j=i; s[j];j++){
//         swap(s[i],s[j]);
//         func(s,i+1);
//         swap(s[i],s[j]);
//         }
// }
// void func2(string ip, string op){
//     if(ip.size()==0){
//         cout<<op<<endl;
//         return;
//     }
//     for(int i=0; i<ip.size();i++){
//         char ch=ip[i];
//         func(ip.substr(0,i)+
//         ip.substr(i+1), op +ip[i]);
//     }
// }
// int main(){
//     // freopen("input.txt", "r", stdin); 
//     // freopen("output.txt","w",stdout);
    
//     string s="abc";
//     string ip=s;
//     string op="";
//     // func(s, 0);
//     return 0;
// }














#include<iostream>
#include<cstring>
#include<algorithm>
using namespace std;
int main()
{
    
    int n, m, k, strength;
    cin>>n>>m>>k>>strength;
    char park[n][m];

    for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++){
            cin>>park[i][j];
           
        }
       
    }

    // for (int i = 0; i < n; i++){
    //     for (int j = 0; j < m; j++){
    //         cout<<park[i][j]<<" ";
           
    //     }
    //     cout<<endl;
       
    // }

    bool success = true;
   
    

    for (int i = 0; i < n; i++){
        for (int j = 0; j < m; j++){

            if( strength <= k){
                success = false;
                break;
       
           }

            if(park[i][j] == '.'){
                strength -= 2;

            }
            else if(park[i][j] == '*'){
                strength += 5;
            }
            else if(park[i][j] == '#'){
                break;
            }
            if (j != m - 1) {
                strength -= 1;
            }

            
           
        }
        if(!success) break;

       
    }

    if(success == true && strength>=k){
        cout<<"Yes" <<endl;
        cout<< strength <<endl;


    }
    else cout<<"No"<<endl;


    return 0;
}



