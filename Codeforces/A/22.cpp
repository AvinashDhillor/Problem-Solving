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

    int y, w;
    cin >> y >> w;
    int range = 7 - max(y, w);
    int lcm = __gcd(6, range);
    if (range % lcm == 0 && 6 % lcm == 0)
        cout << range / lcm << "/" << 6 / lcm << endl;
    else
        cout << range << "/" << 6 << endl;
    return 0;
}