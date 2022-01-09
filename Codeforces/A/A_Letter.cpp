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
  int n, m, i = 0, j = 0;
  cin >> n >> m;
  vector<string> A(n);
  n--, m--;
  for (string &i : A) cin >> i;

  auto _d = [](auto A, int a, int b) {
    for (int i = 0; i < b; i++) {
      if (A[i][a] == '*') return a;
    }
    return a + 1;
  };

  while (count(all(A[i]), '*') == 0) i++;
  while (_d(A, j, n) != j) j++;
  while (_d(A, m, n + 1) != m) m--;
  while (count(all(A[n]), '*') == 0) n--;

  for (int p = i; p <= n; p++) {
    for (int q = j; q <= m; q++) {
      cout << A[p][q];
    }
    cout << endl;
  }
  return 0;
}