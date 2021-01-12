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

    int n, k;
    cin >> n >> k;

    if (n <= k) {
        string sol = "";
        for (int i = 0; i < n; i++) {
            sol += i + 'a';
        }
        cout << sol << endl;
    } else {
        string sol = "", tmp = "";
        for (int i = 0; i < k; i++) {
            tmp += i + 'a';
        }
        for (int i = 0; i < n / k; i++)
            sol += tmp;
        for (int i = 0; i < n % k; i++) {
            sol += tmp[i];
        }
        cout << sol << endl;
    }

    return 0;
}