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

    string one = "VIBGYOR";
    string two = "GYORGYOR";

    int d = n / 7;
    for (i = 0; i < d; i++)
        cout << one;

    for (int k = 0; k < n % 7; k++) {
        cout << two[k];
    }

    return 0;
}