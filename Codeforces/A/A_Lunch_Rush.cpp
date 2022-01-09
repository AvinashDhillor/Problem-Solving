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
  int n, k, ans = INT_MIN, f, t;
  cin >> n >> k;

  for (int i = 0; i < n; i++) {
    cin >> f >> t;
    ans = (t > k) ? max(ans, f - (t - k)) : max(ans, f);
  }
  cout << ans;
  return 0;
}