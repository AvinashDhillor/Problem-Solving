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

  int n, m;
  cin >> n >> m;
  int count = 0;
  for (int i = 0; i * i <= n; i++) {
    if (i + (n - i * i) * (n - i * i) == m) count++;
  }
  cout << count;
  return 0;
}