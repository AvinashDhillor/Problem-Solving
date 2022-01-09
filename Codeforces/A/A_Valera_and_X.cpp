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

    int n;
    cin >> n;
    vector<vector<char>> A(n, vector<char>(n));
    map<char, int> map;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cin >> A[i][j];
            map[A[i][j]]++;
        }
    }

    if (map.size() >= 3 || map.size() == 1)
        return cout << "NO", 0;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == j && (A[i][i] == A[0][0] && A[0][0] == A[i][n - i - 1])) {
                map.begin()->second -= 2;
                map.rbegin()->second -= 2;
            }
        }
    }

    if (map.begin()->second == -1 || map.rbegin()->second == -1)
        return cout << "YES", 0;

    cout << "NO";

    return 0;
}