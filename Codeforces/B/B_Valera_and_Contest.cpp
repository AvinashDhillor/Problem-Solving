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

void help(int sk, int k) {
    if (k == 0)
        return;
    int val = sk / k;
    int remainder = sk % k;
    int i = 1;
    for (i = 1; i <= remainder; i++)
        cout << val + 1 << " ";

    for (; i <= k; i++) {
        cout << val << " ";
    }
}

int main() {
    FASTIO
    int n, k, l, r, sall, sk;
    cin >> n >> k >> l >> r >> sall >> sk;
    help(sk, k);
    help((sall - sk), n - k);
    return 0;
}