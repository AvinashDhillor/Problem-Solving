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

  int n;
  cin >> n;
  vector<pair<int, int>> A(n);
  for (int i = 0; i < n; i++) {
    cin >> A[i].first;
    A[i].second = i;
  }

  sort(all(A));

  if (A[0].first != A[1].first)
    cout << A[0].second + 1;
  else
    cout << "Still Rozdil";

  return 0;
}