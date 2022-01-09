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

    int wires;
    cin >> wires;
    vector<int> A(wires);
    for (int &i : A)
        cin >> i;
    int t;
    cin >> t;
    while (t--) {
        int x, y;
        cin >> x >> y;
        if (x - 2 >= 0) {
            A[x - 2] += y - 1;
        }
        if (x < wires) {
            A[x] += A[x - 1] - y;
        }
        A[x - 1] = 0;
    }

    for (int i : A)
        cout << i << endl;

    return 0;
}