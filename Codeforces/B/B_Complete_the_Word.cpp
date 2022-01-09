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

    string s, ans = "";
    cin >> s;
    if (s.size() < 26)
        return cout << -1, 0;
    int f = 0;
    for (int i = 25; i < s.size(); i++) {
        int jc = 0;
        set<char> A;
        if (i - 26 >= 0)
            ans += (s[i - 26] == '?' ? 'A' : s[i - 26]);

        for (int j = i; j >= i - 25; j--) {
            if (s[j] == '?')
                jc++;
            else
                A.insert(s[j]);
        }
        if (jc + A.size() == 26) {
            string asd = "";
            for (int i = 'A'; i <= 'Z'; i++) {
                if (A.find((char)i) == A.end())
                    asd += (char)i;
            }
            int k = 0;
            for (int j = i - 25; j <= i; j++) {
                if (s[j] == '?')
                    ans += asd[k++];
                else
                    ans += s[j];
            }
            replace(s.begin() + i + 1, s.end(), '?', 'A');
            ans += s.substr(+i + 1, s.size());
            f = 1;
            break;
        }
    }
    if (f == 1) {
        cout << ans;
    } else {
        cout << -1;
    }

    return 0;
}