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

  int n, k;
  cin >> n;
  int len = 1, sol = 1, prev = INT_MAX;
  for (int i = 0; i < n; i++) {
    cin >> k;
    if (prev >= k) len = 0;
    len++, prev = k;
    sol = max(len, sol);
  }
  cout << sol << endl;
  return 0;
}