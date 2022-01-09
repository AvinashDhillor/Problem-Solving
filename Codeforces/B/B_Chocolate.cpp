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
    int n;
    cin >> n;
    int start = 0, end = n - 1;

    vector<int> A(n);

    for (int &i : A)
        cin >> i;

    while (start < n && A[start] == 0)
        start++;
    while (end >= 0 && A[end] == 0)
        end--;

    if (end < start) {
        return cout << 0, 0;
    }

    long long sol = 1;

    for (int i = start; i <= end; i++) {
        if (A[i] == 0) {
            int k = i + 1;
            int count = 1;
            while (k < end && A[k] != 1) {
                k++;
                count++;
            }
            i = k - 1;
            sol *= (count + 1);
        }
    }
    cout << sol;
    return 0;
}