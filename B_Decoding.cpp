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

    int n;
    cin >> n;
    string s;
    cin >> s;
    deque<char> A;
    if (n & 1) {
        A.push_back(s[0]);
        for (int i = 1; i < n; i++) {
            if (i & 1)
                A.push_front(s[i]);
            else
                A.push_back(s[i]);
        }

    } else {
        A.push_back(s[0]);
        A.push_back(s[1]);
        for (int i = 2; i < n; i++) {
            if (i & 1)
                A.push_back(s[i]);
            else
                A.push_front(s[i]);
        }
    }

    for (auto it : A) {
        cout << it;
    }

    return 0;
}