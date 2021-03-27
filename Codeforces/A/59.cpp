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

    int t, a, b;
    cin >> t;
    vector<pair<int, int>> A;
    for (int i = 0; i < t; i++) {
        cin >> a >> b;
        A.push_back({a, b});
    }
    for (int i = 0; i < t; i++) {
        if (A[i].first != A[i].second) {
            cout << "rated";
            return 0;
        }
    }
    int flag = 0;
    for (int i = 0; i < t; i++) {
        if (A[i].first == A[i].second) {
            if (i > 0 && (A[i - 1].first < A[i].first)) {
                flag = 1;
                break;
            }
        }
    }
    cout << (flag == 1 ? "unrated" : "maybe");
    return 0;
}