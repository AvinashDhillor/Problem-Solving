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

  /**
   * find element surrounded by maximum smaller elements
   */

  int n, sol = -10e4;
  cin >> n;
  vector<int> A(n);
  for (int &i : A) cin >> i;

  for (int i = 0; i < n; i++) {
    int x = i - 1, y = i + 1;
    int count = 1;
    int prevX = A[i], prevY = A[i];
    while (x >= 0 && A[x] <= prevX) {
      prevX = A[x];
      count++, x--;
    }
    while (y < n && A[y] <= prevY) {
      prevY = A[y];
      count++, y++;
    }
    sol = max(sol, count);
  }

  cout << sol;

  return 0;
}