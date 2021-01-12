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

    int n;
    cin >> n;
    pair<string, int> pr[n];
    map<string, int> mp, mp2;

    for (int i = 0; i < n; i++) {
        cin >> pr[i].first >> pr[i].second;
        mp[pr[i].first] += pr[i].second;
    }

    int mx = 0;
    for (auto x : mp)
        mx = max(mx, x.second);

    for (int i = 0; i < n; i++) {
        if ((mp2[pr[i].first] += pr[i].second) >= mx && mp[pr[i].first] == mx)
            return cout << pr[i].first, 0;
    }

    return 0;
}