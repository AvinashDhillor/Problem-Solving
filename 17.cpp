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

    string s;
    cin >> s;
    int ans = 0;
    char init = 0;
    for (int i = 0; i < s.size(); i++) {
        ans += min(abs(s[i] - 'a' - init), 26 - abs(s[i] - 'a' - init));
        init = s[i] - 'a';
    }
    cout << ans << endl;

    return 0;
}