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

    double vp, vd, t, f, c;
    cin >> vp >> vd >> t >> f >> c;
    if (vd <= vp)
        return cout << 0, 0;
    double pdist = 0, ddist = 0;
    pdist += vp * t;
    double sol = 0;
    while (pdist < c) {
        double newdist = (pdist * vp) / (vd - vp);
        pdist += newdist;
        ddist = pdist;
        if (pdist < c) {
            sol++;
            pdist += ((ddist / vd) + f) * vp;
        }
    }

    cout << sol;
    return 0;
}