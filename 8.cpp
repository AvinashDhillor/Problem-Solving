#include <bits/stdc++.h>

using namespace std;

#define endl "\n"

void solve() {
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

#ifndef ONLINE_JUDGE
    freopen("in.txt", "r", stdin);
    freopen("err.txt", "w", stderr);
    freopen("out.txt", "w", stdout);
#endif

    int size;
    cin >> size;
    vector<int> A(size);
    for (int i = 0; i < size; i++) {
        cin >> A[i];
    }
    sort(A.begin(), A.end());
    for (int i : A) {
        cout << i << " ";
    }
    cout << endl;
    return 0;
}