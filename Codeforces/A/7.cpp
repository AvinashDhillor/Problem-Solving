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
    int a, b;
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            int n;
            cin >> n;
            if (n == 1) {
                a = i + 1, b = j + 1;
            }
        }
    }
    cout << abs(a - 3) + abs(b - 3) << endl;

    return 0;
}