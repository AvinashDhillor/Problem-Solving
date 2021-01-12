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
    getline(cin, s);
    if (s[1] == '}') {
        cout << 0 << endl;
    } else {
        set<char> A;
        for (int i = 1; i < s.size(); i += 3) {
            A.insert(s[i]);
        }
        cout << A.size() << endl;
    }

    return 0;
}