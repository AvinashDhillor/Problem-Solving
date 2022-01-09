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

vector<bool> visited;
long long X, Y;

void dfs(int i, vector<vector<int>> &A) {
    visited[i] = true;
    X++;
    for (auto it : A[i]) {
        Y++;
        if (!visited[it]) {
            dfs(it, A);
        }
    }
}

int main() {
    FASTIO

    int n, m;
    cin >> n >> m;
    vector<vector<int>> A(n + 1);
    vector<int> weight(n + 1, 0);
    visited = vector<bool>(n + 1, false);

    for (int i = 0; i < m; i++) {
        int u, v;
        cin >> u >> v;
        A[u].push_back(v);
        A[v].push_back(u);
    }

    for (int i = 1; i <= n; i++) {
        X = 0, Y = 0;
        if (!visited[i]) {
            dfs(i, A);

            long long ab = (X * (X - 1)) / 2;
            Y /= 2;
            if (ab != Y)
                return cout << "NO", 0;
        }
    }

    cout << "YES";
    return 0;
}