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

    int t, n;
    int A[102];
    cin >> t;
    for (int i = 1; i <= t; i++) {
        cin >> n;
        A[n] = i;
    }

    for (int i = 1; i <= t; i++)
        cout << A[i] << " ";

    return 0;
}