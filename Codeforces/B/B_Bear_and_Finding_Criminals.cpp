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

int sol() {}

int main() {
  FASTIO
  int n, x, sol = 0;
  cin >> n >> x;
  vector<int> A(n);
  for (int &i : A) cin >> i;
  sol = A[x - 1] == 1;
  int l = x - 2, y = x;
  while (l >= 0 && y < n) {
    if (A[l] && A[y]) sol += 2;
    l--, y++;
  }

  sol += (l < 0 ? count(A.begin() + y, A.end(), 1)
                : count(A.begin(), A.begin() + l + 1, 1));

  cout << sol;

  return 0;
}