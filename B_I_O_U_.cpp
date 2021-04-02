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
    int n, k;
    cin >> n >> k;
    vector<int> A(n + 1, 0);
    for (int i = 0; i < k; i++) {
        int a, b, c;
        cin >> a >> b >> c;
        if (i == 0) {
            A[b] += c;
        } else {
            A[a] -= c;
            A[b] += c;
        }
    }

    cout << accumulate(all(A), 0);
    return 0;
}