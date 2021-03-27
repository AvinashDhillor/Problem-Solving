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

  int n, k;
  cin >> n;
  vector<bool> visited(n, true);
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
      cin >> k;
      if (k == 1)
        visited[i] = false;
      else if (k == 2)
        visited[j] = false;
      else if (k == 3)
        visited[i] = visited[j] = false;
    }
  }

  cout << count(all(visited), true) << endl;

  for (int i = 0; i < n; i++)
    if (visited[i]) cout << i + 1 << " ";

  return 0;
}