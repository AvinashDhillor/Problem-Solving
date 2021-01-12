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

    int n, b, d;
    cin >> n >> b >> d;
    int ans = 0, weight = 0;
    for (int i = 0; i < n; i++) {
        int orange;
        cin >> orange;
        if (orange > b)
            continue;
        weight += orange;

        if (weight > d) {
            ans++;
            weight = 0;
        }
    }
    cout << ans << endl;

    return 0;
}