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
    string s;
    cin >> s;
    set<char> A;

    for (int i = 0; i < s.size(); i++) {
        A.insert(tolower(s[i]));
    }

    if (A.size() == 26)
        cout << "YES";
    else
        cout << "NO";

    return 0;
}