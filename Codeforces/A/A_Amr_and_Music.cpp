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
  vector<pair<int, int>> A(n);
  for (int i = 0; i < n; i++) {
    cin >> A[i].first;
    A[i].second = i;
  }

  sort(all(A));
  vector<int> B;
  for (auto i : A) {
    if (k - i.first >= 0) {
      B.push_back(i.second);
      k -= i.first;
    } else
      break;
  }
  cout << B.size() << endl;
  for (int i : B) cout << i + 1 << " ";

  return 0;
}