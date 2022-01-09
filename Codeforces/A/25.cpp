#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

void solve() {
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

#ifndef ONLINE_JUDGE
    freopen("in.txt", "r", stdin);
    freopen("err.txt", "w", stderr);
    freopen("out.txt", "w", stdout);
#endif

    int n, t, k, d;
    cin >> n >> t >> k >> d;
    int without_next = n / k;
    if (n % k != 0)
        without_next++;
    int cake1 = without_next * t;
    int cake = 0;
    for (int i = d + t; i < cake1; i += t) {
        cake += k;
        cake += (i / t) * k;
        if (cake >= n)
            break;
    }
    cout << (cake >= n ? "YES" : "NO") << endl;

    return 0;
}