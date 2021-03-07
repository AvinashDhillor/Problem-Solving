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

    int n, k;
    cin >> n >> k;
    vector<int> Y(2 * n + 1);
    for (int &i : Y)
        cin >> i;

    for (int i = 1; i < Y.size() && k != 0; i += 2) {
        if (Y[i] - 1 > Y[i - 1] && Y[i] - 1 > Y[i + 1]) {
            Y[i]--;
            k--;
        }
    }

    for (int i : Y)
        cout << i << " ";

    return 0;
}