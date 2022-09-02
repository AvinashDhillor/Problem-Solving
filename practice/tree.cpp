#include <bits/stdc++.h>

using namespace std;

class Node {
public:
    int data;
    Node *left, *right;
    Node(int data) {
        this->data = data;
        this->left = this->right = nullptr;
    }
};

Node *root;

Node *insert(Node *root, int data) {
    if (root == nullptr)
        return root = new Node(data);

    if (root->data < data) {
        root->right = insert(root->right, data);
    } else if (root->data > data) {
        root->left = insert(root->left, data);
    }
    return root;
}

void inorder(Node *root) {
    if (root == nullptr) {
        return;
    }
    inorder(root->left);
    cout << root->data << " ";
    inorder(root->right);
}

int main() {

    for (int i = 10; i > 0; i--) {
        root = insert(root, i);
    }

    inorder(root);
    return 0;
}