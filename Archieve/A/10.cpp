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

    string s;
    cin >> s;
    bool a[26];
    memset(a, 0, sizeof a);
    for (int i = 0; i < s.size(); i++) {
        a[s[i] - 'a'] = 1;
    }

    int count = 0;
    for (int i = 0; i < 26; i++) {
        if (a[i] == 1)
            count++;
    }

    cout << (count & 1 ? "IGNORE HIM!" : "CHAT WITH HER!") << endl;
    return 0;
}