#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()
#define pii pair<int, int>
#define INF 1000000000

#define FASTIO                   \
    ios::sync_with_stdio(false); \
    cin.tie(NULL);               \
    cout.tie(NULL);

int n, m;

int BFS() {
    queue<int> q;
    vector<int> dist(20001, -1);
    q.push(n);
    dist[n] = 0;
    while (!q.empty()) {
        int u = q.front();
        q.pop();
        if (u == m) {
            return dist[u];
        }
        int a = u * 2;
        if (a <= 20000 && dist[a] == -1) {
            q.push(a);
            dist[a] = dist[u] + 1;
        }
        int b = u - 1;
        if (b > 0 && dist[b] == -1) {
            q.push(b);
            dist[b] = dist[u] + 1;
        }
    }
    return -1;
}

int main() {
    FASTIO

    cin >> n >> m;
    cout << BFS();
    return 0;
}