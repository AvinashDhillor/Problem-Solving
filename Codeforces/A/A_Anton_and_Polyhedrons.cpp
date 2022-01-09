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
    map<char, int> m({{'T', 4}, {'C', 6}, {'O', 8}, {'D', 12}, {'I', 20}});
    int sum = 0;
    while (t--) {
        string s;
        cin >> s;
        sum += m[s[0]];
    }
    cout << sum << endl;

    return 0;
}