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
    int sol = INT_MAX;
    if (m <= n)
        return cout << n - m, 0;
    else {
        for (int i = 1; i <= n; i++) {
            int moves = 0;
            double lp = m / i;
            int p = ceil(log(lp) / log(2.0));
            moves += n - i;
            int ab = i * pow(2, p);
            if (ab < m) {
                ab *= 2;
            }

            moves += p;
            moves += ab - m;
            sol = min(sol, moves);
        }
    }

    cout << sol;

    return 0;
}