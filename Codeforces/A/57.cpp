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

    long long no, k;
    cin >> no >> k;
    long long odd, even;
    (no & 1) ? odd = no / 2 + 1 : odd = no / 2;
    even = no - odd;
    long long ans;
    if (k <= odd)
        ans = 2 * k - 1;
    else {
        k -= odd;
        ans = 2 * k;
    }
    cout << ans << endl;

    return 0;
}