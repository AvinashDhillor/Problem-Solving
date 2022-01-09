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
  int n, s;
  cin >> n >> s;
  vector<pair<int, int>> A(n);
  for (auto &i : A) cin >> i.first >> i.second;
  A.push_back({s, 0});
  int total = 0;
  for (int i = n - 1; i >= 0; i--) {
    total += A[i + 1].first - A[i].first;
    if (A[i].second > total) total += A[i].second - total;
  }
  cout << total + A[0].first;
  return 0;
}