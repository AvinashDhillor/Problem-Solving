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

    int k, r;
    cin >> k >> r;
    int tmp = k;
    int c = 0;
    while (k % 10 != 0 && (k % 10) - r != 0) {
        c++;
        k += tmp;
    }
    cout << c + 1 << endl;
    return 0;
}