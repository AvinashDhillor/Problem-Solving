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

  int n, x;
  cin >> n >> x;
  int sum = 0;
  for (int i = 0; i < n; i++) {
    int n;
    cin >> n;
    sum += n;
  }
  sum = abs(sum);
  int sol = (sum / x) + (sum % x == 0 ? 0 : 1);
  cout << sol;

  return 0;
}