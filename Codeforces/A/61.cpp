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

    int t;
    cin >> t;
    map<string, int> A;
    while (t--) {
        string s;
        cin >> s;
        A[s]++;
    }
    int mx = 0;
    string result;
    for (auto it : A) {
        if (it.second > mx) {
            mx = it.second;
            result = it.first;
        }
    }
    cout << result << endl;

    return 0;
}