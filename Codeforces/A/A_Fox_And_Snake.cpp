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
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
      if ((i + 1) & 1)
        cout << "#";
      else if ((i + 1) % 4 == 0 && j == 0)
        cout << "#";
      else if ((i + 1) % 4 != 0 && (i + 1) % 2 == 0 && j == m - 1)
        cout << "#";
      else
        cout << ".";
    }
    cout << endl;
  }
  return 0;
}