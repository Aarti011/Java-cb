

#include<iostream>

using namespace std;
class node{
public:
    int data;
    node *left, *right;
    node(int d){
        data = d;
        left = right = NULL;
    }
};

node *binaryTree(){
    int data;
    cin>>data;
    if(data == -1){
        return NULL;
    }

    node* root = new node(data);

    root->left = binaryTree();
	root->right = binaryTree();

	return root;

    
}

node* lowestCommonAncester(node *root, int a, int b){
    // base case
    if(!root) return NULL;

    if(root->data == a ||  root->data ==  b){
        return root;
    }

    node* leftMeNodeKaAddress = lowestCommonAncester(root->left, a, b);
    node* rightMeNodeKaAddress = lowestCommonAncester(root->right , a, b);

    if(leftMeNodeKaAddress and rightMeNodeKaAddress ) return root;
    else if(leftMeNodeKaAddress) return leftMeNodeKaAddress;
    return rightMeNodeKaAddress;
   
}

int main(){
        node* root;
        node* ans=lowestCommonAncester(root,3,13);
        if( ans)cout<< ans->data<<endl;
        else cout<<"NO lca possible\n";
        return 0;
    
}