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

  vector<vector<char>> A(n, vector<char>(n, '.'));
  int count = 0;
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      if ((i + 1) & 1) {
        if ((j + 1) & 1) count++, A[i][j] = 'C';
      } else if (!((i + 1) & 1))
        if (!((j + 1) & 1)) count++, A[i][j] = 'C';
    }
  }
  cout << count << endl;
  for (auto i : A) {
    for (auto j : i) {
      cout << j;
    }
    cout << endl;
  }
  return 0;
}