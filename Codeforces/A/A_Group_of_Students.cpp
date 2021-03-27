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
  vector<int> A(n);
  for (int &i : A) cin >> i;
  cin >> x >> y;
  int sum = accumulate(all(A), 0), prev = 0;
  for (int i = 0; i < n; i++) {
    int another = A[i] + prev;
    int diff = sum - another;
    prev = another;
    if ((another >= x && another <= y) && (diff >= x && diff <= y)) {
      return cout << i + 2, 0;
    }
  }

  cout << 0;
  return 0;
}