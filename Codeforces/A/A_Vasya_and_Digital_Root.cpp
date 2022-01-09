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

  int k, n, i = 2;
  cin >> k >> n;
  if (n == 0 && k > 1) return cout << "No solution", 0;
  cout << n;
  for (; i <= k; i++) cout << 0;

  return 0;
}