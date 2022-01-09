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
    int c = 0;
    for (int i = 0; i < n; i++) {
        int a, b;
        cin >> a >> b;
        c += (b - a + 1);
    }

    c %= k;
    if (c != 0) {
        c = k - c;
    }

    cout << c << endl;
    return 0;
}