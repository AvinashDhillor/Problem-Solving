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

    ll l, r;
    cin >> l >> r;
    for (ll i = l; i <= r; i++) {
        for (ll j = i + 1; j <= r; j++) {
            for (ll k = j + 1; k <= r; k++) {
                if (__gcd(i, j) == 1 && __gcd(j, k) == 1 && __gcd(i, k) != 1) {
                    cout << i << " " << j << " " << k << endl;
                    return 0;
                }
            }
        }
    }

    cout << -1;

    return 0;
}