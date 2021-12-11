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
    int n, q, k;
    cin >> n;
    vector<pair<int, int>> A(n);
    for (int i = 0; i < n; i++) {
        cin >> A[i].first;
        A[i].second = i + 1;
    }
    sort(all(A));
    unsigned long long ans1 = 0, ans2 = 0;
    cin >> q;
    while (q--) {
        cin >> k;
        auto index = lower_bound(all(A), make_pair(k, numeric_limits<int>::min())) - A.begin();
        ans1 += A[index].second;
        ans2 += n - A[index].second + 1;
    }

    cout << ans1 << " " << ans2;

    return 0;
}