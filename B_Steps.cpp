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

int n, m, x, y;

int way(int s, int t) {
    int a = INT_MAX, b = INT_MAX;
    if (s < 0) {
        a = (x - 1) / abs(s);
    } else if (s > 0) {
        a = (n - x) / s;
    }
    if (t < 0) {
        b = (y - 1) / abs(t);
    } else if (t > 0) {
        b = (m - y) / t;
    }
    if (s != 0 && t != 0)
        x += s * min(a, b),
            y += t * min(a, b);
    else if (s == 0) {
        y += t * b;
    } else if (t == 0) {
        x += x * a;
    }
    return min(a, b);
}

int main() {
    FASTIO

    cin >> n >> m;
    cin >> x >> y;
    int q;
    cin >> q;
    long long sol = 0;

    for (int i = 0; i < q; i++) {
        int s, t;
        cin >> s >> t;
        sol += way(s, t);
    }

    cout << sol;

    return 0;
}