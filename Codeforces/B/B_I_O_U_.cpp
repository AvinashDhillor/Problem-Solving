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

    int n, k;
    cin >> n >> k;
    long sum = 0, orig = 0;
    vector<pair<int, int>> A(n + 1, {0, 0});
    while (k--) {
        int x, y, z;
        cin >> x >> y >> z;
        orig += z;
        A[x].second -= z;
        A[y].first += z;
    }

    for (int i = 1; i <= n; i++) {
        if (A[i].first != 0) {
            sum += min(A[i].first, abs(A[i].second));
        }
    }

    cout << orig - sum;
    return 0;
}