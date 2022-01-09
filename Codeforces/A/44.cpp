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
    vector<int> A(t);
    for (int &i : A)
        cin >> i;
    if (t == 1) {
        cout << 0 << endl;
    } else {
        map<int, int> set;
        for (int i = 0; i < t; i++) {
            set[A[i]]++;
        }
        if (set.size() == 1)
            cout << 0 << endl;
        else
            cout << A.size() - (*set.begin()).second - (*set.rbegin()).second << endl;
    }
    return 0;
}