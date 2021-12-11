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

    // freopen("input.txt", "r", stdin);
    // freopen("output.txt", "w", stdout);

    int n;
    cin >> n;
    vector<int> A(n);
    for (int &i : A)
        cin >> i;
    sort(all(A));

    int ans = n - 1;
    for (int i = 0; i < n; i++) {
        int tr = i + (n - (upper_bound(all(A), 2 * A[i]) - A.begin()));
        ans = min(ans, tr);
    }

    cout << ans;

    return 0;
}