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

double find_x(double a, double b, double r, double p1, double p2) {
    double tmp = r * r * b * p1;
    double tmp2 = a * p2 + b * p1;
    return sqrt(tmp / tmp2);
}

int main() {
    FASTIO
    setprecision(15);
    cout << fixed;

    int x;
    cin >> x;
    vector<double> A(x);
    for (double &i : A)
        cin >> i;

    double r = *max_element(all(A));

    int p1;
    cin >> p1;
    vector<double> B(p1);
    for (double &i : B)
        cin >> i;

    int p2;
    cin >> p2;
    vector<double> C(p2);
    for (double &i : C)
        cin >> i;

    int a, b;
    cin >> a >> b;

    double ans = INT_MIN;

    for (int j = 0; j < p1; j++) {
        for (int k = 0; k < p2; k++) {
            ans = max(ans, find_x(a, b, r, B[j], C[k]));
        }
    }

    cout << ans;
    return 0;
}