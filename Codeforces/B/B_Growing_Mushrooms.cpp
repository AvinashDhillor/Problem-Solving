
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

    cout << setprecision(2) << fixed;

    double n, t1, t2, p;
    cin >> n >> t1 >> t2 >> p;
    vector<pair<int, double>> A;
    for (int i = 0; i < n; i++) {
        double a, b;
        cin >> a >> b;
        double dist1 = (t1 * min(a, b) * ((100.0 - p) / 100.0)) + t2 * max(a, b);
        double dist2 = (t1 * max(a, b) * ((100.0 - p) / 100.0)) + t2 * min(a, b);
        A.push_back({i + 1, max(dist1, dist2)});
    }

    sort(all(A), [&](const pair<int, double> A, const pair<int, double> B) {
        if (B.second == A.second)
            return A.first < B.first;
        return A.second > B.second;
    });

    for (auto it : A) {
        cout << it.first << " " << it.second << endl;
    }
    return 0;
}
