#include <bits/stdc++.h>

using namespace std;

class Node {
public:
    int val;
    Node *left, *right;
    Node(int val) {
        this->val = val;
        left = right = nullptr;
    }
};

Node *root;

Node *insert(Node *root, int val) {
    if (root == nullptr)
        return root = new Node(val);
    if (root->val < val) {
        root->right = insert(root->right, val);
    } else if (root->val > val) {
        root->left = insert(root->left, val);
    }
    return root;
}

bool twoSum(Node *root, int k) {
}

void inorder(Node *root) {
    if (root == nullptr)
        return;
    inorder(root->left);
    cout << root->val << " ";
    inorder(root->right);
}

int main() {
    Node *root = nullptr;
    for (int i = 10; i >= 0; i--) {
        root = insert(root, i);
    }

    inorder(root);
    return 0;
}