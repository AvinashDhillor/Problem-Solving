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

    int t;
    cin >> t;
    vector<int> A(t + 1);
    for (int i = 1; i <= t; i++) {
        int n;
        cin >> n;
        A[n] = i;
    }

    int prev = 1;
    for (int i = t; i >= 1; i--) {
        int val = A[i];
        if (prev > val)
            cout << i << " ";
        else {
            for (int i = prev; i < val; i++)
                cout << "\n";

            prev = val;
            cout << i << " ";
        }
    }

    return 0;
}