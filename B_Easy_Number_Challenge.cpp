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

    long mod = pow(2, 30), ans = 0;
    int a, b, c;
    cin >> a >> b >> c;

    vector<int> primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    unordered_map<int, int> B;
    for (int i = 1; i <= a; i++) {
        for (int j = 1; j <= b; j++) {
            for (int k = 1; k <= c; k++) {
                int d = i * j * k;
                B[d]++;
            }
        }
    }
    int one = 0;
    for (auto it : B) {
        int tmpe = it.first;
        vector<int> tmp;
        if (tmpe == 1) {
            one += it.second;
            continue;
        }
        for (int i = 0; i < primes.size(); i++) {
            if (primes[i] > it.first)
                break;
            int count = 0;
            while (tmpe > 0 && tmpe % primes[i] == 0) {
                tmpe /= primes[i];
                count++;
            }
            tmp.push_back(count);
        }
        int km = 1;
        for (auto mp : tmp) {
            km *= (mp + 1);
        }

        ans += (km * it.second);
        ans %= mod;
    }
    ans += one;
    ans %= mod;
    cout << ans;

    return 0;
}