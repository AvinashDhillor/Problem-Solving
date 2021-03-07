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
  int t, x, y, l_zero = 0, r_zero = 0;
  cin >> t;
  for (int i = 0; i < t; i++) {
    cin >> x >> y;
    if (x == 0) l_zero++;
    if (y == 0) r_zero++;
  }

  cout << min(l_zero, t - l_zero) + min(r_zero, t - r_zero);

  return 0;
}