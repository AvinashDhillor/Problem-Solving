#include <bits/stdc++.h>

using namespace std;

#define endl "\n"

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

    string a, b;
    cin >> a >> b;
    for (int i = 0; i < a.size(); i++) {
        a[i] = toupper(a[i]);
        b[i] = toupper(b[i]);
    }
    if (a < b) {
        cout << -1;
    } else if (a > b) {
        cout << 1;
    } else {
        cout << 0;
    }
    cout << endl;

    return 0;
}