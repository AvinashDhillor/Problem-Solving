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

  int n;
  cin >> n;
  vector<vector<char>> A(n + 2, vector<char>(n + 2, '#'));

  for (int i = 1; i <= n; i++)
    for (int j = 1; j <= n; j++) cin >> A[i][j];

  int sol = 0;
  for (int i = 1; i <= n; i++)

    for (int j = 1; j <= n; j++) {
      int count = 0;
      if (A[i - 1][j] == 'o') count++;
      if (A[i + 1][j] == 'o') count++;
      if (A[i][j + 1] == 'o') count++;
      if (A[i][j - 1] == 'o') count++;
      if (count == 0 or count == 2 or count == 4) sol++;
    }

  cout << (sol == n * n ? "YES" : "NO");

  return 0;
}
