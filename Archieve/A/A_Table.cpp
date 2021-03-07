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
  int a[n][m];
  for (int i = 0; i < n; i++)
    for (int j = 0; j < m; j++) cin >> a[i][j];

  bool f = 0;
  for (int i = 0; i < m; i++)
    if (a[0][i] == 1 || a[n - 1][i] == 1) f = 1;

  for (int i = 0; i < n; i++)
    if (a[i][0] == 1 || a[i][m - 1] == 1) f = 1;

  cout << (f ? 2 : 4);
  return 0;
}