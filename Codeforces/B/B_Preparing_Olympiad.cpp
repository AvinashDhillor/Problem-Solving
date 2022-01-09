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

    int n, l, r, x;
    cin >> n >> l >> r >> x;

    vector<int> A(n);
    for (int &i : A)
        cin >> i;

    sort(all(A));

    int count = 0;
    for (int i = 1; i <= pow(2, n); i++) {
        vector<int> B;
        int sum = 0;
        for (int j = 0; j < A.size(); j++) {
            if (i & (1 << j)) {
                sum += A[j];
                B.push_back(A[j]);
            }
        }
        if (sum <= r && sum >= l && *B.rbegin() - B[0] >= x) {
            count++;
        }
    }

    cout << count;

    return 0;
}