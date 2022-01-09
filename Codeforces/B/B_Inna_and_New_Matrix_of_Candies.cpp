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

    int n, m;
    cin >> n >> m;
    char c;
    set<int> A;
    for (int i = 0; i < n; i++) {
        pair<int, int> x, y;
        for (int j = 0; j < m; j++) {
            cin >> c;
            if (c == 'G') {
                x = {i, j};
            } else if (c == 'S') {
                y = {i, j};
            }
        }
        if (y.second < x.second)
            return cout << -1, 0;
        A.insert(y.second - x.second);
    }

    cout << A.size();

    return 0;
}