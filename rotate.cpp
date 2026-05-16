// #include<iostream>
// #include<climits>
// #include<cstring>
// using namespace std;
 
// int main()
// {
//     char a[100]="coding";
//     char b[]="Blocks";
//     int b=strlen(b);
//     int i=strlen(a);

//     int j=0;
//     while (j<b)
//     {
//         a[i++]=b[j++];
        
//     }
    
//     return 0;
// }




// #include<iostream>
// #include<cstring>

// using namespace std;
 
// int main()
// {
//     int n;
//     cin>>n;
//     cin.get();
//     char a[100];
//     int largest=0;
//     char val[100];
//     for(int i =0; i<n;i++){
//         cin.getline(a,100);
//         cout<< a<<'$'<<endl;
//         if(largest<strlen(a)){
//             largest=strlen(a);
//             strcpy(val,a);
//         }
//     }
//     cout<<endl<<val;

//     return 0;
// }



#include <iostream>
#include <cstring>
using namespace std;
void doit(char a[], int n, char c='\n'){
char f;
int j=0;
f=cin.get();
while(f !=c && j<n-1){
    a[j++]=f;
    f=cin.get();
}
a[j]='\0';
}
int main() {
    char v[100];
    doit(v,100,'.');
    cout<< "Array"<<v<<endl;


	return 0;
}
































