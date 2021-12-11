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
    int p, q, l, r;
    cin >> p >> q >> l >> r;
    vector<pair<int, int>> A, B;

    for (int i = 0; i < p; i++) {
        int x, y;
        cin >> x >> y;
        A.push_back({x, y});
    }

    for (int i = 0; i < q; i++) {
        int x, y;
        cin >> x >> y;
        B.push_back({x, y});
    }

    int count = 0, f = 0;
    for (int i = l; i <= r; i++) {
        f = 0;
        for (int j = 0; j < q; j++) {
            for (int k = 0; k < p && f != 1; k++) {
                if (B[j].first + i >= A[k].first && B[j].first + i <= A[k].second)
                    f = 1;
                else if (B[j].second + i >= A[k].first && B[j].second + i <= A[k].second)
                    f = 1;
                else if (B[j].first + i <= A[k].first && B[j].second + i >= A[k].second)
                    f = 1;
            }
            if (f == 1)
                break;
        }
        if (f == 1)
            count++;
    }
    cout << count;
    return 0;
}