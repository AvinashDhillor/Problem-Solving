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
  vector<string> A(n);
  for (int i = 0; i < n; i++) cin >> A[i];

  for (string &s : A)
    if (count(all(s), 'S') == 0) fill(all(s), '#');

  for (int i = 0, count = 0; i < m; i++, count = 0) {
    for (int j = 0; j < n && count == 0; j++)
      if (A[j][i] == 'S') count++;

    for (int j = 0; j < n && count == 0; j++) A[j][i] = '#';
  }

  int ans = 0;
  for (string s : A) ans += count(all(s), '#');

  cout << ans;
  return 0;
}