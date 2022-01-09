#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

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
    vector<int> A, B, C;
    for (int i = 0; i < size; i++) {
        int n;
        cin >> n;
        if (n == 1) {
            A.push_back(i);
        } else if (n == 2) {
            B.push_back(i);
        } else {
            C.push_back(i);
        }
    }

    int m = min(A.size(), min(B.size(), C.size()));
    cout << m << endl;
    for (int i = 0; i < m; i++) {
        cout << A[i] + 1 << " " << B[i] + 1 << " " << C[i] + 1 << endl;
    }

    return 0;
}