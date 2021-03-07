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

    int t;
    cin >> t;
    if (t == 0)
        return cout << 1, 0;
    int a[5] = {0, 8, 4, 2, 6};
    if (t % 4 == 0)
        return cout << 6, 0;
    else
        return cout << a[t % 4], 0;

    return 0;
}