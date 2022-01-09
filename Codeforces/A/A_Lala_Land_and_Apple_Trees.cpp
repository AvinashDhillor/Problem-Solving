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

  int n, x, y;
  cin >> n;
  vector<pair<int, int>> A, B;
  for (int i = 0; i < n; i++) {
    cin >> x >> y;
    x < 0 ? A.push_back({x, y}) : B.push_back({x, y});
  }

  sort(all(A), greater<pair<int, int>>());
  sort(all(B));

  int sum = 0, i = 0;
  for (i = 0; i < min(A.size(), B.size()); i++)
    sum += A[i].second + B[i].second;

  if (A.size() > B.size())
    sum += A[i].second;
  else if (B.size() > A.size())
    sum += B[i].second;

  cout << sum;

  return 0;
}