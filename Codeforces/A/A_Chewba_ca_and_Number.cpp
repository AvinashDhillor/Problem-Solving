#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

int ch(char c) {
    return c - '0';
}

char av(int n) {
    return n + '0';
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
    cin >> s;
    string sol = "";
    if (9 - ch(s[0]) != 0 && 9 - ch(s[0]) < ch(s[0]))
        sol += av(9 - ch(s[0]));
    else
        sol += s[0];
    for (int i = 1; i < s.size(); i++) {
        if (9 - ch(s[i]) < ch(s[i]))
            sol += av(9 - ch(s[i]));
        else
            sol += s[i];
    }
    cout << sol << endl;
    return 0;
}