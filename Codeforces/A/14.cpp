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

    int size;
    cin >> size;
    string s;
    cin >> s;
    int count = 0;
    for (int i = 1; i < size; i++) {
        if (s[i - 1] == s[i])
            count++;
    }
    cout << count << endl;

    return 0;
}