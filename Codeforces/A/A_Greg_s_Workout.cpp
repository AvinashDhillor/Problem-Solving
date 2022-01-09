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

  int n, k, a;
  cin >> n;
  vector<pair<int, int>> A(3);
  for (int i = 0; i < n; i++) {
    cin >> k;
    A[i % 3].first += k;
    A[i % 3].second = i % 3;
  }

  sort(all(A));
  a = A[2].second;
  cout << (a == 0 ? "chest" : (a == 1 ? "biceps" : "back"));

  return 0;
}