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

    int police = 0;
    int size;
    cin >> size;
    vector<int> A(size);
    for (int &i : A)
        cin >> i;
    int ans = 0;
    for (int i : A) {
        (police == 0 && i == -1) ? ans++ : i > 0 ? police += i : police--;
    }
    cout << ans << endl;

    return 0;
}