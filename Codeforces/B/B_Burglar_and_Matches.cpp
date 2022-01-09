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
  cin >> n >> k;
  vector<pair<int, int>> A(k);
  for (auto &i : A) cin >> i.second >> i.first;

  sort(all(A), greater<pair<int, int>>());
  int sol = 0;
  for (int i = 0; i < k && n >= 0; i++) {
    n - A[i].second < 0 ? sol += n * A[i].first
                        : sol += A[i].second * A[i].first;
    n -= A[i].second;
  }
  cout << sol;

  return 0;
}