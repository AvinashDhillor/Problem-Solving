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

int dist(int x1, int x2, int y1, int y2) {
    int a = pow((x1 - x2), 2);
    int b = pow((y1 - y2), 2);
    return a + b;
}

int main() {
    FASTIO

    int x1, y1, x2, y2;
    cin >> x1 >> y1 >> x2 >> y2;
    vector<pair<int, int>> A;
    for (int i = min(y1, y2); i <= max(y1, y2); i++) {
        A.push_back({x1, i});
        A.push_back({x2, i});
    }

    for (int i = min(x1, x2) + 1; i < max(x1, x2); i++) {
        A.push_back({i, y1});
        A.push_back({i, y2});
    }

    int t, count = 0;
    cin >> t;
    vector<tuple<int, int, int>> B;
    while (t--) {
        int x, y, z;
        cin >> x >> y >> z;
        B.push_back({x, y, z});
    }

    for (auto it : A) {
        int f = 0;
        for (int i = 0; i < B.size(); i++) {
            int x = get<0>(B[i]);
            int y = get<1>(B[i]);
            int z = get<2>(B[i]);
            int dis = dist(it.first, x, it.second, y);
            if (z * z >= dis) {
                f = 1;
                break;
            }
        }
        if (f == 0)
            count++;
    }

    cout << count;
    return 0;
}