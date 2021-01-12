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
  vector<vector<bool>> A(3, vector<bool>(3, true));
  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
      int n;
      cin >> n;
      n = n % 2;
      if (n == 1) {
        A[i][j] = !A[i][j];
        if (i - 1 >= 0) A[i - 1][j] = !A[i - 1][j];
        if (j - 1 >= 0) A[i][j - 1] = !A[i][j - 1];
        if (i + 1 < 3) A[i + 1][j] = !A[i + 1][j];
        if (j + 1 < 3) A[i][j + 1] = !A[i][j + 1]
      }
    }
  }

  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
      cout << (A[i][j] ? '1' : '0');
    }
    cout << endl;
  }

  return 0;
}