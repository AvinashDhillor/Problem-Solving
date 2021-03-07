#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

#ifndef ONLINE_JUDGE
    freopen("in.txt", "r", stdin);
    freopen("err.txt", "w", stderr);
    freopen("out.txt", "w", stdout);
#endif

    int t;
    cin >> t;
    vector<int> A(t), mn(t), mx(t);
    for (int &i : A)
        cin >> i;

    mn[0] = abs(A[0] - A[1]);
    mx[0] = abs(A[0] - A[t - 1]);
    mx[t - 1] = abs(A[0] - A[t - 1]);
    mn[t - 1] = abs(A[t - 1] - A[t - 2]);
    for (int i = 1; i < t - 1; i++) {
        mn[i] = min(abs(A[i] - A[i - 1]), abs(A[i] - A[i + 1]));
        mx[i] = max(abs(A[i] - A[0]), abs(A[i] - A[t - 1]));
    }

    for (int i = 0; i < t; i++) {
        cout << mn[i] << " " << mx[i] << endl;
    }

    return 0;
}