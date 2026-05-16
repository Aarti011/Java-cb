#include <iostream>
#include<climits>
using namespace std;
bool comparator(Vector<int> meetingA,Vector<int> meetingB){
    int startA=meetingA[0];
    int startB=meetingB[0];
    int endA=meetingA[1];
    int endB=meetingB[1];

}
int minMeet(vector<vector<int>> & a){
    sort(a.begin(),a.end(),comparator);
    priority_queue<int, vector<int>, greater<int> >h;
    for( int i=0; i<a.size();++i){
        int currMeet=a[i][0];
        int currMeet= a[i][0];
        
    }

}


int main()
{


    cout<<""<<endl;
    
    return 0;
}












// #include <iostream>
// #include<climits>
// using namespace std;
// void printheap(priority_queue<int, vector<int>, greater<int> >h){
//     while(!h.empty()){
//         cout<<h.top()<<" ";
//         h.pop();
//     }cout<<endl;
// }


// int main()
// {
//     priority_queue<int, vector<int>, greater<int> >h;
//    int k=3;
//    int cs=0;
//     while(-1){
//         int data;
//         cin>>data;
//         if( data==-1){

//         }else{
//             if( cs==k){
//                 if(h.top()<data){
//                     h.pop();
//                     h.push(data);

//                 }
//             }else{
//                 h.push(data);
//                 cs++;
//             }
//         }
//    }


//     cout<<""<<endl;
    
//     return 0;
// }












// #include <iostream>
// #include <queue>
// #include <algorithm>
// #include<climits>
// using namespace std;
// class Student{
//     public:
//     string name;
//     int age;
//     int marks;
//     Student(string n, int a, int m){
//         name=n;
//         age=a;
//         marks=m;
//     }
// };
// class myclass
// {
// public:
//     bool operator()(Student a, Student b){
//         return a.name < b.name;
//     }
//     void print(Student a, Student b){
//         cout<<a.name<<endl;
//         cout<<a.age<<endl;
//         cout<<a.marks<<endl;
//         cout<<b.name<<endl;
//         cout<<b.age<<endl;
//         cout<<b.marks<<endl;

//     }
    
// };

// int main()
// {
//     priority_queue<Student, vector<Student>, myclass> h;
//     Student a ("Devansh", 21, 34);
//     Student b ("Daksh", 22, 94);
//     Student c ("Dipak", 21, 84);
//     Student d ("Alfiya", 25, 36);
//     h.push(a);
//     h.push(b);
//     h.push(c);
//     h.push(d);

//     while(!h.empty()){
//         Student x=h.top();
//         x.print();
//         h.pop();
//     }


    
//     return 0;
// }




















/ #include <iostream>
// #include <queue>
// #include <algorithm>
// #include<climits>
// using namespace std;

// class node
// {
// public:
//     int data;
//     node *left, *right;
//     node(int d)
//     {
//         data = d;
//         left = right = NULL;
//     }
// };

// node *insertInBST(node *root, int data)
// {
//     if (!root)
//     {
//         root = new node(data);
//         return root;
//     }

//     if (data < root->data)
//     {
//         root->left = insertInBST(root->left, data);
//     }
//     else
//     {
//         root->right = insertInBST(root->right, data);
//     }
//     return root;
// }

// node *buildBST()
// {
//     node *root = NULL;
//     int data;
//     cin >> data;

//     while (data != -1)
//     {
//         root = insertInBST(root, data);
//         cin >> data;
//     }
//     return root;
// }

// void levelOrder(node *root)
// {
//     queue<node *> q;

//     q.push(root);
//     q.push(NULL);

//     while (!q.empty())
//     {
//         node *f = q.front();
//         q.pop();

//         if (f)
//         {
//             cout << f->data << " ";
//             if (f->left)
//                 q.push(f->left);
//             if (f->right)
//                 q.push(f->right);
//         }
//         else
//         {
//             cout << endl;
//             if (!q.empty())
//             {
//                 q.push(NULL);
//             }
//         }
//     }
// }

// int minTree(node* root){
//     if(!root) return INT_MAX;
//     int left = minTree(root->left);
//     int right = minTree(root->right);

//     return min(root->data, min(left, right));
// }
// int maxTree(node* root){
//     if(!root) return INT_MIN;

//     int left = maxTree(root->left);
//     int right = maxTree(root->right);

//     return max(root->data, max(left, right));
// }

// bool isBST(node* root,int mi=INT_MIN, int max=INT_MAX){
//     if(!root) return true;

//     // int leftmax = maxTree(root->left);
//     // int rightmin= minTree(root->right);

//     if(root->data >= mi and root->data <= max and isBST(root->left,mi,root->data) and isBST(root->right,root->data, max)){
//         return true;
//     }
//     else return false; 
// }

// bool isbSTCorrect(node* root){
//     if(!root) return true;
// }
// int main()
// {
//     node *root = buildBST();
//     levelOrder(root);

//     cout<<minTree(root)<<endl;
//     cout<<maxTree(root)<<endl;
//     if(isBST) cout<<"BST hai bhaii BST!"<<endl;
//     else cout<<"Not A BST"<<endl;3
    
//     return 0;
// }









// #include<iostream>
// #include<cstring>
// #include<algorithm>
// #include <vector>
// #include <queue>
// using namespace std;
// class node{
//     public:
//         int data;
//         node* left;
//         node* right;

//         node(int d){
//             data = d;
//             left = NULL;
//             right = NULL;
//         }
// };

// node* insertBST(node* root, int data){
//     if (!root)  
//     {
//         root = new node(data);
//         return root;
//     }

//     if (data < root->data)
//     {
//         root->left = insertBST(root->left, data);
//     }
//     else{
//         root->right = insertBST(root->right, data);
//     }
//     return root;  
// }

// node* createBST(){
//     node* root = NULL;

//     int data;
//     cin>>data;
//     while (data != -1)
//     {
//         root = insertBST(root, data);
//         cin>>data;
//     }
//     return root;

// }

// void preOrder(node* root){
//     if(!root) return;

//     cout<<root->data<<" ";
//     preOrder(root->left);
//     preOrder(root->right);
// }

// void inOrder(node* root){
//     if(!root) return;

//     inOrder(root->left);
//     cout<<root->data<<" ";
//     inOrder(root->right);
// }

// void printBetweenTwoNumbers(node* root, int k1, int k2){
//     if(!root) return;

//     printBetweenTwoNumbers(root->left, k1, k2);
//     if (root->data >= k1 && root->data <= k2)
//     {
//         cout<<root->data<<" ";
//     }
    
//     printBetweenTwoNumbers(root->right, k1, k2);
// }

// void searchElement(node* root, int target, int& elementFound){
//     if(!root) return;

//     searchElement(root->left, target, elementFound);
//     if (root->data == target)
//     {
//         cout<<"Element Found At: "<<root;
//         elementFound=1;
//         return;
//     }
    
//     searchElement(root->right, target, elementFound);
// }

// void postOrder(node* root){
//     if(!root) return;

//     postOrder(root->left);
//     postOrder(root->right);
//     cout<<root->data<<" ";
// }

// void levelOrderPrint(node* root){
//     queue<node*> q;

//     q.push(root);
//     q.push(NULL);

//     while (!q.empty())
//     {
//         node* f = q.front();
//         q.pop();
//         if (f)
//         {
//             cout<<f->data<<" ";
//             if (f->left) q.push(f->left);            
//             if (f->right) q.push(f->right);            
//         }
//         else{
//             cout<<endl;
//             if(!q.empty()) q.push(NULL);
//         }        
//     }   
// }

// int main()
// {
    
//     node* root = createBST();
//     printBetweenTwoNumbers(root, 4, 10);
//     cout<<endl;

//     int elementFound = 0;
//     searchElement(root, 6, elementFound);
//     if (elementFound == 0)
//     {
//         cout<<"Element Not Found."<<endl;
//     }
    
//     // preOrder(root);
//     // cout<<endl;
//     // inOrder(root);
//     // cout<<endl;
//     // postOrder(root);
//     // cout<<endl;
//     // levelOrderPrint(root);
    

//     return 0;
// }















// #include <iostream>
// #include <queue>
// using namespace std;

// class node
// {
// public:
//     int data;
//     node *left, *right;
//     node(int d)
//     {
//         data = d;
//         left = right = NULL;
//     }
// };

// node *insertInBST(node *root, int data)
// {
//     if (!root)
//     {
//         root = new node(data);
//         return root;
//     }

//     if (data < root->data)
//     {
//         root->left = insertInBST(root->left, data);
//     }
//     else
//     {
//         root->right = insertInBST(root->right, data);
//     }
//     return root;
// }
// node *buildBST()
// {
//     node *root = NULL;
//     int data;
//     cin >> data;

//     while (data != -1)
//     {
//         root = insertInBST(root, data);
//         cin >> data;
//     }
//     return root;
// }
// void levelOrder(node *root)
// {
//     queue<node *> q;

//     q.push(root);
//     q.push(NULL);

//     while (!q.empty())
//     {
//         node *f = q.front();
//         q.pop();

//         if (f)
//         {
//             cout << f->data << " ";
//             if (f->left)
//                 q.push(f->left);
//             if (f->right)
//                 q.push(f->right);
//         }
//         else
//         {
//             cout << endl;
//             if (!q.empty())
//             {
//                 q.push(NULL);
//             }
//         }
//     }
// }

// int main()
// {
    
//     node *root = buildBST();
//     levelOrder(root);
//     return 0;

// }
















// #include<iostream>

// using namespace std;
// class node{
// public:
//     int data;
//     node *left, *right;
//     node(int d){
//         data = d;
//         left = right = NULL;
//     }
// };

// node *binaryTree(){
//     int data;
//     cin>>data;
//     if(data == -1){
//         return NULL;
//     }

//     node* root = new node(data);

//     root->left = binaryTree();
// 	root->right = binaryTree();

// 	return root;

    
// }

// node* lowestCommonAncester(node *root, int a, int b){
//     // base case
//     if(!root) return NULL;

//     if(root->data == a ||  root->data ==  b){
//         return root;
//     }

//     node* leftMeNodeKaAddress = lowestCommonAncester(root->left, a, b);
//     node* rightMeNodeKaAddress = lowestCommonAncester(root->right , a, b);

//     if(leftMeNodeKaAddress and rightMeNodeKaAddress ) return root;
//     else if(leftMeNodeKaAddress) return leftMeNodeKaAddress;
//     return rightMeNodeKaAddress;
   
// }

// int main(){
//         node* root = binaryTree();
//         node* ans=lowestCommonAncester(root,3,13);
//         if( ans)cout<< ans->data<<endl;
//         else cout<<"NO lca possible\n";
//         return 0;

// }








// #include<iostream>

// using namespace std;
// class node{
// public:
//     int data;
//     node *left, *right;
//     node(int d){
//         data = d;
//         left = right = NULL;
//     }
// };

// node *buildTree(){
//     int data;
//     cin>>data;
//     if(data == -1){
//         return NULL;
//     }

//     node* root = new node(data);

//     root->left = buildTree();
// 	root->right = buildTree();

// 	return root;

// }

// void solve( node* root, int k, int d=0){
//     if(!root) return;
//     if( d==k){
//         cout<<root->data<<" ";
//         return;
//     }
//         solve( root->left,k, d+1);
//         solve( root->right,k, d+1);
// }

// int distanceofNode( node* root, int node, int k){
//     if(!root) return -1;

//     if(root->data ==node){
//         solve(root,k );
//         return 0;
//     }
//     int d= distanceofNode(root->left, node, k);
//     if (d != -1) { // Valid distance hai
// 		if (d + 1 == k) {
// 			cout << root->data << " ";
// 			return -1; // Ab aur upar distance k par nodes nahi milengi
// 		}

// 		int rd = k - d - 2;
// 		solve(root->right, rd); // Ab right subtree par rd distance wali nodes print kardo
// 		return d + 1;
// 	}
//      d= distanceofNode(root->right, node, k);
//     if (d != -1) {
// 		if (d + 1 == k) {
// 			cout << root->data << " ";
// 			return -1; // Ab aur upar distance k par nodes nahi milengi
// 		}

// 		int rd = k - d - 2;
// 		solve(root->left, rd); // Ab left subtree par rd distance wali nodes print kardo
// 		return d + 1;
// 	}

// 	return -1;

    
           
// }

// int main(){
//         node* root=buildTree();
//         distanceofNode(root,10,2);
//         return 0;
    
// }