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

    int n, f;
    unsigned long long sum = 0;
    cin >> n >> f;
    vector<pair<int, int>> A(n), B;

    for (int i = 0; i < n; i++) {
        cin >> A[i].first;
        cin >> A[i].second;
    }

    for (int i = 0; i < n; i++) {
        if (A[i].first < A[i].second) {
            int diff = min({A[i].first * 2, A[i].second}) - A[i].first;
            B.push_back({diff, i});
        }
    }

    sort(all(B), greater<pair<int, int>>());

    for (int i = 0; i < B.size(); i++) {
        A[B[i].second].second = f == 0 ? A[B[i].second].first : B[i].first + A[B[i].second].first;
        f += f > 0 ? -1 : 0;
    }

    for (int i = 0; i < n; i++)
        sum += A[i].second;

    cout << sum;

    return 0;
}