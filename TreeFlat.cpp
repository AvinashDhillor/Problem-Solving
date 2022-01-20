#include<bits/stdc++.h>

using namespace std;

class Node {
public:
    int val;
    Node *left, *right;
    Node(int data) {
        this->val = data;
        left = right = nullptr;
    }
};

void inorder(Node *root) {
    if(root == nullptr) return;
    cout << root->val  << " ";
    inorder(root->left);
    inorder(root->right);
}

Node *l = new Node(-1);

void util(Node *root) {
    if(root == nullptr) return;
    if(l != nullptr) {
        l->right = new Node(root->val);
        l = l->right;
    }
    util(root->left );
    util(root->right);
}

int main() {
    Node *root = new Node(1);
    root->left = new Node(2);
    root->right = new Node(5);
    root->left->left = new Node(3);
    root->left->right = new Node(4);
    root->right->right = new Node(6);

    Node *tmp = l;

    util(root);
    cout << "list start here " << endl; 
    while(tmp != nullptr) {
        cout << tmp->val  << " ";
        tmp = tmp->right;
    }

    return 0;
}
