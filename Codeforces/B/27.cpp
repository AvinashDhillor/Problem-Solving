#include <bits/stdc++.h>

using namespace std;

string s(long x) {
    if (x == 0)
        return "Carrots";
    if (x == 1)
        return "Kiwis";
    return "Grapes";
}

int main() {
    long n, m, k, t, x, y;
    cin >> n >> m >> k >> t;

    vector<long> Dist(k);

    for (long i = 0; i < k; i++) {
        cin >> x >> y;
        x--, y--;
        Dist[i] = x * m + y;
    }

    sort(Dist.begin(), Dist.end());

    for (long i = 0; i < t; i++) {
        cin >> x >> y;
        x--, y--;
        long len = x * m + y;
        long index = lower_bound(Dist.begin(), Dist.end(), len) - Dist.begin();
        cout << (index < k && Dist[index] == len ? "Waste" : s((len - index) % 3)) << "\n";
    }

    return 0;
}
