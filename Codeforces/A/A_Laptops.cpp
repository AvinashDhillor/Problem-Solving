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
  int t;
  cin >> t;
  vector<pair<int, int>> A(t);
  for (int i = 0; i < t; i++) {
    cin >> A[i].first >> A[i].second;
  }
  sort(all(A));
  for (int i = 1; i < t; i++) {
    if (A[i].second < A[i].first) return cout << "Happy Alex", 0;
  }
  cout << "Poor Alex";
  return 0;
}