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

double fact(int n) {
    double a = 1;
    if (n == 0)
        return a;
    for (int i = 1; i <= n; i++)
        a *= i;
    return a;
}

int main() {
    FASTIO

    cout << setprecision(12);
    cout << fixed;

    int pos1 = 0, pos2 = 0, unknown = 0;
    string a, b;
    cin >> a >> b;

    for (int i = 0; i < a.size(); i++) {
        b[i] == '?' ? unknown++ : pos2 += b[i] == '+' ? 1 : -1;
        pos1 += a[i] == '+' ? 1 : -1;
    }

    if (pos1 == pos2 && unknown == 0)
        return cout << 1.0, 0;

    int dif = pos1 - pos2;

    if (abs(dif) > unknown || (unknown - abs(dif)) & 1)
        return cout << 0.0, 0;

    int q = (unknown - abs(dif)) / 2;
    int p = abs(dif) + q;
    double ans = fact(unknown) / (fact(q) * fact(p));

    cout << ans / pow(2.0, (double)unknown);

    return 0;
}