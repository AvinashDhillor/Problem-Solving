#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

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
    char c;
    cin >> t >> c;
    int count = 0;

    while (t--) {
        string s;
        cin >> s;
        set<char> set(s.begin(), s.end());

        char ck = '0';
        for (auto it : set) {
            if (it == ck++)
                ;
            if (ck > c) {
                count++;
                break;
            }
        }
    }
    cout << count;
    return 0;
}