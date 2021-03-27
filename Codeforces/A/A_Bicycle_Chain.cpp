#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

#define FASTIO                 \
  ios::sync_with_stdio(false); \
  cin.tie(NULL);               \
  cout.tie(NULL);

int main() {
  FASTIO

  int n, k, m;
  cin >> n;
  vector<int> A(n);
  for (int &i : A) cin >> i;
  cin >> m;
  int mx = INT_MIN, sol = 0;
  for (int i = 0; i < m; i++) {
    cin >> k;
    for (int j = 0; j < n; j++) {
      if (k / A[j] * A[j] == k && k / A[j] >= mx) {
        if (mx == k / A[j]) {
          sol++;
        } else {
          mx = max(mx, k / A[j]);
          sol = 1;
        }
      }
    }
  }
  cout << sol << endl;

  return 0;
}