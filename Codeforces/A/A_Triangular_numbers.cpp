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
  int n, count = 1;
  cin >> n;
  for (int i = 2; i <= n && count < n; i++) count += i;

  cout << (count == n ? "YES" : "NO");
  return 0;
}