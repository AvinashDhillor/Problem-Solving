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
    int top, a, b;
    cin >> top >> a >> b;
    vector<int> A;
    A.push_back(min(top, 7 - top));
    A.push_back(max(top, 7 - top));
    for (int i = 0; i < n - 1; i++) {
        cin >> a >> b;
        vector<bool> visited(7, false);
        visited[a] = visited[b] = visited[7 - a] = visited[7 - b] = true;
        vector<int> B;
        for (int i = 1; i <= 6; i++) {
            if (!visited[i])
                B.push_back(i);
        }
        int k = 2;
        while (k--) {
            if (A[k] != B[k])
                return cout << "NO", 0;
        }
    }
    return cout << "YES", 0;

    return 0;
}