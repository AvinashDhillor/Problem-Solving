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

pair<int, int> cal(int value) {
    if (value == 1)
        return {1, 1};
    int j = 1;
    for (int i = 2; i <= value; i++) {
        if (i & 1) {
            j += 2;
        } else {
            j += 1;
        }
    }
    return {j - 1, j};
}

int main() {
    FASTIO

    double a, x, y;
    cin >> a >> x >> y;
    int place = ceil(y / a);

    int maxH = place * a;
    if (place == 1 || place % 2 == 0) {
        double yt = maxH, yb = maxH - a, xl = -a / 2.0, xr = a / 2.0;
        if (y > yb && y < yt && x > xl && x < xr) {
            int num1 = cal(place).second;
            return cout << num1, 0;
        }
    } else {
        double yt = maxH, yb = maxH - a, xl1 = -a, xr1 = 0, xl2 = 0, xr2 = a;
        pair<int, int> tmp = cal(place);
        int num1 = tmp.first, num2 = tmp.second;
        bool ans1 = y > yb && y < yt && x > xl1 && x < xr1;
        bool ans2 = y > yb && y < yt && x > xl2 && x < xr2;
        if (ans1) {
            return cout << num1, 0;
        }
        if (ans2) {
            return cout << num2, 0;
        }
    }

    cout << -1;

    return 0;
}