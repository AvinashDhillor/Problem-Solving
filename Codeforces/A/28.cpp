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

    int n, x;
    cin >> n >> x;
    long long total_icecreams = x, distress = 0;
    for (int i = 0; i < n; i++) {
        char c;
        int icecreams;
        cin >> c >> icecreams;
        if (c == '+') {
            total_icecreams += icecreams;
        } else {
            total_icecreams >= icecreams ? total_icecreams -= icecreams : distress++;
        }
    }
    cout << total_icecreams << " " << distress << endl;

    return 0;
}