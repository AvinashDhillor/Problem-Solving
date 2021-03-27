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
  int n, cost = 0;
  cin >> n;
  vector<pair<int, int>> A(n);
  for (int i = 0; i < n; i++) {
    cin >> A[i].first >> A[i].second;
  }

  for (int i = 0; i < n; i++) {
    int k = A[i].second;
    int ab = 0;
    while (i < n && A[i].second >= k) ab += A[i++].first;
    i--;
    cost += ab * k;
  }
  cout << cost;
  return 0;
}