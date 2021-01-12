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
  vector<pair<int, int>> A;
  for (int i = 0; i < t; i++) {
    int n;
    cin >> n;
    A.push_back({n, i});
  }
  sort(all(A));
  for (int i = 0; i < t / 2; i++) {
    cout << A[i].second + 1 << " " << A[t - i - 1].second + 1 << endl;
  }
  return 0;
}