#include <bits/stdc++.h>

using namespace std;

int main() {

    // int a[10];

    // for (int i = 10; i >= 0; i--) {
    //     a[10 - i] = i;
    // }

    // for (auto i : a) {
    //     cout << i << " ";
    // }
    // cout << endl;

    // cout << *(a + 2) + 5;

    // set<int> set;
    // cout << endl;
    // for (int i = 10; i >= 5; i--) {
    //     set.insert(i);
    // }

    // for (auto i = set.rbegin(); i != set.rend(); i++) {
    //     cout << *i << " ";
    // }

    // cout << endl;

    // vector<int> v;

    // for (int i = 10; i >= 5; i--) {
    //     v.push_back(i);
    // }

    // cout << *(v.begin() + 3) << endl;

    cout << "---------";

    set<int> set;
    set.insert(3);
    set.insert(2);
    set.insert(1);
    for (auto it = set.rbegin(); it != set.rend(); it++) {
        cout << *it << " ";
    }

    cout << endl;

    int limit = 3;

    auto it = set.rbegin();
    while (limit > 0) {
        limit--;
        cout << *it << " ";
        it++;
    }
}