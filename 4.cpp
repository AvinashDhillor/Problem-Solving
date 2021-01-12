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
    string s;
    cin >> s;
    int a = 0, b = 0;
    for (int i = 0; i < t; i++) {
        if (s[i] == 'A')
            a++;
        else
            b++;
    }
    if (a == b) {
        cout << "Friendship" << endl;
    } else if (a > b) {
        cout << "Anton" << endl;
    } else {
        cout << "Danik" << endl;
    }
    return 0;
}