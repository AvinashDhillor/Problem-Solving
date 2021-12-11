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

    int n;
    int x, y;
    cin >> n >> x >> y;
    set<pair<int, int>> slops;
    for (int i = 0; i < n; i++) {
        int a, b;
        cin >> a >> b;
        a -= x, b -= y;
        int m = __gcd(a, b);
        slops.insert({a / m, b / m});
    }
    cout << slops.size();
    return 0;
}