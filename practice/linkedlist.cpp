#include <bits/stdc++.h>

using namespace std;

class Node {
public:
    int data;
    Node *next;
    Node(int data) {
        this->data = data;
        this->next = nullptr;
    }
};

Node *head;

void insert(int data) {
    if (head == nullptr) {
        head = new Node(data);
    } else {
        Node *tmp = new Node(data);
        tmp->next = head;
        head = tmp;
    }
}

void printSolution() {
    Node *tmp = head;
    while (tmp != nullptr) {
        cout << tmp->data << endl;
        tmp = tmp->next;
    }
}

int main() {
    for (int i = 1; i <= 10; i++) {
        insert(i);
    }
    printSolution();
}