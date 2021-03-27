#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

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

    map<char, int> A;
    string s;
    cin >> s;
    string sol = "";
    for (int i = 0; i < s.size(); i += 2)
        A[s[i]]++;
    for (auto it : A) {
        while (it.second--) {
            sol += it.first;
            if (sol.size() != s.size())
                sol += "+";
        }
    }

    cout << sol << endl;
    return 0;
}