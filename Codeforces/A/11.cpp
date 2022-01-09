#include <bits/stdc++.h>

using namespace std;

#define endl "\n"

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
    int upper_count = 0, lower_count = 0;
    for (int i = 0; i < s.size(); i++) {
        if (s[i] >= 'a')
            lower_count++;
        else
            upper_count++;
    }
    if (upper_count > lower_count) {
        for (int i = 0; i < s.size(); i++) {
            s[i] = toupper(s[i]);
        }
    } else {
        for (int i = 0; i < s.size(); i++) {
            s[i] = tolower(s[i]);
        }
    }
    cout << s << endl;
    return 0;
}