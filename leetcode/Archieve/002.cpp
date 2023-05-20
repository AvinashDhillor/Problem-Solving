#include <bits/stdc++.h>

using namespace std;

int minDeletionSize(vector<string> &strs) {
    vector<string> tmp(strs[0].size());
    for (string i : strs) {
        int index = 0;
        for (char c : i) {
            tmp[index++] += c;
        }
    }
    int delete_col = 0;
    for (string k : tmp) {
        string ano = k;
        sort(ano.begin(), ano.end());
        cout << k << " " << ano << endl;
        if (ano != k)
            delete_col++;
    }

    return delete_col;
}

int main() {
    vector<string> ab = {"cba", "daf", "ghi"};

    cout << minDeletionSize(ab);

    return 0;
}