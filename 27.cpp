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

    int t;
    cin >> t;
    while (t--) {
        string s;
        cin >> s;
        if (s.size() <= 10) {
            cout << s;
        } else {
            cout << s[0] << s.size() - 2 << s[s.size() - 1];
        }
        cout << endl;
    }

    return 0;
}