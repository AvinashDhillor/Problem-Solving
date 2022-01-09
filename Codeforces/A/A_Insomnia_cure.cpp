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
  int k, l, m, n, d;
  cin >> k >> l >> m >> n >> d;
  vector<bool> A(d + 1, true);
  int i = 1;
  while (k * i <= d) A[k * i++] = false;

  i = 1;
  while (l * i <= d) A[l * i++] = false;

  i = 1;
  while (m * i <= d) A[m * i++] = false;

  i = 1;
  while (n * i <= d) A[n * i++] = false;

  cout << count(all(A), false);
  return 0;
}