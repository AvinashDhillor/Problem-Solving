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
  int n, m;
  cin >> n >> m;
  int sol = 0;
  for (int i = 1; i <= min(n, m); i++)
    if (m % i == 0 && m / i <= n) sol++;

  cout << sol;

  return 0;
}