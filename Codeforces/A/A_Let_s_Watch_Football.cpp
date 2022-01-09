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

  int a, b, c;
  cin >> a >> b >> c;
  int l = 1, r = a * c;

  int sol = INT_MAX, ans = -1;
  while (l <= r) {
    int mid = l + (r - l) / 2;
    int cost = mid * b + (c * b);
    if (cost > a * c) {
      if (cost < sol) sol = cost, ans = mid;
      r = mid - 1;
    } else if (cost < a * c)
      l = mid + 1;
    else
      return cout << mid, 0;
  }
  cout << ans;
  return 0;
}