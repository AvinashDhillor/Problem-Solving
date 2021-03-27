#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

#ifndef ONLINE_JUDGE
    freopen("in.txt", "r", stdin);
    freopen("err.txt", "w", stderr);
    freopen("out.txt", "w", stdout);
#endif

    int t;
    cin >> t;
    vector<bool> A(t + 1, false);
    int a, b, n;
    cin >> a;
    while (a--) {
        cin >> n;
        A[n] = true;
    }
    cin >> b;
    while (b--) {
        cin >> n;
        A[n] = true;
    }

    for (int i = 1; i <= t; i++) {
        if (!A[i]) {
            cout << "Oh, my keyboard!";
            return 0;
        }
    }
    cout << "I become the guy.";
    return 0;
}