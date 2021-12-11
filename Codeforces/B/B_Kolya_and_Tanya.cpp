#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

#define FASTIO                   \
    ios::sync_with_stdio(false); \
    cin.tie(NULL);               \
    cout.tie(NULL);

int power(long long x, unsigned int y, int p) {
    int res = 1;
    x = x % p;
    if (x == 0)
        return 0;
    while (y > 0) {
        if (y & 1)
            res = (res * x) % p;
        y = y >> 1;
        x = (x * x) % p;
    }
    return res;
}

int main() {
    FASTIO

    int n, MOD = 1000000007;
    cin >> n;
    long long sol = 1, ans = 1;
    sol = power(3, 3 * n, MOD);
    ans = power(7, n, MOD);
    ans = sol - ans;
    if (ans < 0)
        ans += MOD;
    cout << ans;

    return 0;
}