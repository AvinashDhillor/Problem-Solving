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
    vector<int> A(n);
    for (int &i : A)
        cin >> i;
    int i = 0;
    while (k > 0 && A[i] < 0) {
        A[i] *= -1;
        i++;
        k--;
    }
    if (A[i] > A[i - 1])
        i = i - 1;

    if (k != 0 && A[i] != 0) {
        if (k & 1) {
            A[i] *= -1;
        }
    }

    cout << accumulate(all(A), 0);
    return 0;
}