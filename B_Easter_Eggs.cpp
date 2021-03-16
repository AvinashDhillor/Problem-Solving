#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

#define FASTIO                   \
    ios::sync_with_stdio(false); \
    cin.tie(NULL);               \
    cout.tie(NULL);

int main() {
    FASTIO

    int n, i;
    cin >> n;

    string one = "VIBG";
    string two = "ROYG";

    int d = n / 4;
    for (i = 0; i < d; i++)
        cout << (i & 1 ? two : one);

    for (int k = 0; k < n % 4; k++) {
        cout << (i & 1 ? two[k] : one[k]);
    }

    return 0;
}