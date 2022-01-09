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

    int t;
    cin >> t;
    int pc = 0;
    for (int i = 0; i < t; i++) {
        int a, b, c;
        cin >> a >> b >> c;
        int count = 0;
        if (a == 1)
            count++;
        if (b == 1)
            count++;
        if (c == 1)
            count++;
        if (count >= 2)
            pc++;
    }
    cout << pc << endl;
    return 0;
}