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

    string s, t, n = "";
    cin >> s >> t;
    int index = 0;
    if (s.size() > t.size()) {
        int f = 0;
        for (int i = 0; i < t.size(); i++) {
            int tmp = find(s.begin() + index, s.end(), t[i]) - s.begin();
            if (tmp == s.size()) {
                f = 1;
                break;
            }
            index = tmp + 1;
        }

        if (f == 1) {
            map<char, int> A;
            for (char i : t)
                A[i]++;

            for (char i : s) {
                if (A.find(i) != A.end() && A[i] > 0)
                    A[i]--;
            }

            int ans = 1;
            for (auto i : A) {
                if (i.second > 0)
                    ans = -1;
            }
            if (ans == -1)
                cout << "need tree";
            else {
                cout << "both";
            }
        } else {
            cout << "automaton";
        }
    } else if (s.size() == t.size()) {
        sort(all(s));
        sort(all(t));
        if (s == t) {
            cout << "array";
        } else {
            cout << "need tree";
        }
    } else {
        cout << "need tree";
    }

    return 0;
}