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
  int n, x, y, z;
  cin >> n;
  vector<int> A(3, 0);
  while (n--) {
    cin >> x >> y >> z;
    A[0] += x;
    A[1] += y;
    A[2] += z;
  }

  for (int i : A)
    if (i != 0) return cout << "NO", 0;
  cout << "YES";
  return 0;
}