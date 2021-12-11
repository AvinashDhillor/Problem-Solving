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
    int n, x = 0, y = 1, f = 0;
    cin >> n;
    vector<int> A(n);
    for (int &i : A)
        cin >> i;

    A.push_back(INT_MAX);

    for (int i = 0; i < n && f != 2; i++)
        if (A[i] - A[i + 1] > 0 && f == 0)
            x = i,
            f = 1;
        else if (f == 1 && A[i] - A[i + 1] < 0 && i + 1 == (y = i + 1))
            break;

    reverse(A.begin() + x, A.begin() + y);

    cout << (is_sorted(all(A)) ? "yes\n" + to_string(x + 1) + " " + to_string(y) : "no");

    return 0;
}