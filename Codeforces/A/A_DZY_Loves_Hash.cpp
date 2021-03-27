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

  int p, n, k;
  cin >> p >> n;
  set<int> A;
  for (int i = 1; i <= n, cin >> k; i++, A.insert(k % p))
    if (A.find(k % p) != A.end()) return cout << i, 0;

  cout << -1;

  return 0;
}