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
    vector<vector<int>> A(t, vector<int>(2));
    for (int i = 0; i < t; i++)
        cin >> A[i][0] >> A[i][1];

    int count = 0;
    for (int i = 0; i < t; i++)
        for (int j = 0; j < t; j++)
            if (A[i][0] == A[j][1])
                count++;

    cout << count << endl;
    return 0;
}