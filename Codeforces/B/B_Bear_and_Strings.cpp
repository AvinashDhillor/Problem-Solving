#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

#define FASTIO                   \
    ios::sync_with_stdio(false); \
    cin.tie(NULL);               \
    cout.tie(NULL);

int main() {
    FASTIO

    string s;
    cin >> s;
    long sol = 0;
    int prev = 0;
    for (int i = 3; i < s.size(); i++) {
        if (s[i] == 'r' && s[i - 1] == 'a' && s[i - 2] == 'e' && s[i - 3] == 'b') {
            if (i - 3 >= 0) {
                int f = 1 + (s.size() - 1 - i);
                sol += (f) + (i - 3 - prev) * f;
                prev = i - 2;
            }
        }
    }
    cout << sol;
    return 0;
}