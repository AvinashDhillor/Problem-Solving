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
    long long n, a, b;
    cin >> n >> a >> b;

    vector<long long> A(n);
    for (ll &i : A)
        cin >> i;

    double long ratio = (double)a / (double)b;

    for (ll i : A) {
        unsigned long long ab = i * ratio;
        long long l = 0, r = i;
        while (l <= r) {
            long long mid = (l + r) / 2;
            if (mid * ratio < ab) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        cout << (i - l) << " ";
    }

    return 0;
}