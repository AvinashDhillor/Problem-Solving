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

    int r1, r2, c1, c2, d1, d2;
    cin >> r1 >> r2 >> c1 >> c2 >> d1 >> d2;
    int x, a, b, c;
    x = (d1 + c1 - r2) / 2;
    a = r1 - x;
    b = c1 - x;
    c = r2 - b;

    if (c != r2 - c1 + x)
        return cout << -1, 0;
    set<int> A({a, b, c, x});
    if (A.size() < 4 || *A.rbegin() > 9 || a <= 0 || b <= 0 || c <= 0 || x <= 0) {
        return cout << -1, 0;
    }
    cout << x << " " << a << endl;
    cout << b << " " << c << endl;

    return 0;
}