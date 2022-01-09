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

    int n, t;
    cin >> n >> t;
    if (n == 1 && t == 10) {
        cout << -1;
        return 0;
    }
    if (t == 10) {
        cout << 1;
        for (int i = 0; i < n - 1; i++)
            cout << 0;

    } else
        for (int i = 0; i < n; i++)
            cout << t;

    return 0;
}