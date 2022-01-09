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
  if (n == 0) return cout << 0, 0;
  vector<int> A(12);
  for (int &i : A) cin >> i;
  sort(all(A));
  int sum = 0;
  for (int i = 11; i >= 0; i--) {
    sum += A[i];
    if (sum >= n) return cout << 12 - i, 0;
  }
  cout << -1;

  return 0;
}