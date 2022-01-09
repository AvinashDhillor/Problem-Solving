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

    int a, b;
    cin >> a >> b;
    vector<ll> A(6, a / 5), B(6, b / 5);
    for (int i = 1; i <= a % 5; i++)
        A[i]++;
    for (int i = 1; i <= b % 5; i++)
        B[i]++;
    unsigned long long sum = 0;

    for (int i = 1; i <= 4; i++) {
        sum += A[i] * B[5 - i];
    }
    sum += A[5] * B[5];
    cout << sum << endl;
    return 0;
}