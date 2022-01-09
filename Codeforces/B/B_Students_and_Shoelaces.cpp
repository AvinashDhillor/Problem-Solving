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

    int n, k, x, y;
    cin >> n >> k;

    vector<vector<int>> A(n + 1, vector<int>(n + 1, 0));
    for (int i = 1; i <= k; i++) {
        cin >> x >> y;
        A[x][y] = A[y][x] = 1;
    }

    int round = 0, f = 0;

    do {
        vector<pair<int, int>> pairs;
        f = 0;
        for (int i = 1; i <= n; i++) {
            vector<int> tmp;
            for (int j = 1; j <= n; j++) {
                if (A[i][j])
                    tmp.push_back(j);
            }
            if (tmp.size() == 1) {
                pairs.push_back({i, *tmp.begin()});
                f = 1;
            }
        }
        if (f == 0)
            break;
        for (auto it : pairs)
            A[it.first][it.second] = A[it.second][it.first] = 0;
        round++;
    } while (f == 1);

    cout << round;
    return 0;
}