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
  vector<int> A(n);
  for (int &i : A) cin >> i;
  int sum = accumulate(all(A), 0);
  int ans = 5;
  for (int i = sum + 1; i <= sum + 5; i++)
    if (i % (n + 1) == 1) ans--;

  cout << ans;
  return 0;
}