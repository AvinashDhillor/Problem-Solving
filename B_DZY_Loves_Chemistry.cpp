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

int bfs(const vector<vector<int>> &A, int src, vector<bool> &visited) {
    queue<int> q;
    q.push(src);
    int connected = 0;
    visited[src] = true;
    while (!q.empty()) {
        int u = q.front();
        q.pop();

        for (auto it : A[u]) {
            if (!visited[it]) {
                connected++;
                visited[it] = true;
                q.push(it);
            }
        }
    }

    return connected;
}

int main() {
    FASTIO
    int n, m;
    cin >> n >> m;
    vector<vector<int>> A(n + 1);
    vector<bool> visited(n + 1, false);
    while (m--) {
        int u, v;
        cin >> u >> v;
        A[u].push_back(v);
        A[v].push_back(u);
    }
    int ans = 0;
    for (int i = 1; i <= n; i++) {
        if (!visited[i]) {
            int tmp = bfs(A, i, visited);
            ans += tmp;
        }
    }
    long long sol = pow(2, ans);
    cout << sol;
    return 0;
}