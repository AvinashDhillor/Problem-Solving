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
    int prev = -1;
    int group = 0;
    for (int i = 0; i < t; i++) {
        int n;
        cin >> n;
        if (n != prev) {
            group++;
        }
        prev = n;
    }

    cout << group << endl;
    return 0;
}