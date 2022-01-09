#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

bool isPrime(int n) {
    for (int i = 2; i <= ceil(sqrt(n)); i++)
        if (n % i == 0)
            return false;
    return true;
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

    int n, m;
    cin >> n >> m;
    for (int i = n + 1; i < m; i++) {
        if (isPrime(i))
            return cout << "NO", 0;
    }
    cout << (isPrime(m) ? "YES" : "NO");
    return 0;
}