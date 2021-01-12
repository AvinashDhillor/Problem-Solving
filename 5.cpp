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
    cin >> a >> b;
    int year = 0;
    while (a <= b) {
        a *= 3;
        b *= 2;
        year++;
    }
    cout << year << endl;
    return 0;
}