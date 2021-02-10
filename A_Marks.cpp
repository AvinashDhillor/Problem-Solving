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
  vector<vector<char>> A(n, vector<char>(m));
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
      cin >> A[i][j];
    }
  }

  vector<int> B(m);

  for (int i = 0; i < m; i++) {
    int mx = INT_MIN;
    for (int j = 0; j < n; j++) {
      if (A[j][i] - '0' > mx) {
        mx = A[j][i] - '0';
      }
    }
    B[i] = mx;
  }

  set<int> ans;

  for (int i = 0; i < m; i++) {
    for (int j = 0; j < n; j++) {
      if (A[j][i] - '0' == B[i]) ans.insert(j);
    }
  }

  cout << ans.size();

  return 0;
}