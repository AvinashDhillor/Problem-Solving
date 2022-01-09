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
  for (int i = 1; i <= n / 2; i++)
    if (i % 2 == 0 && (n - i) % 2 == 0) return cout << "YES", 0;

  cout << "NO";
  return 0;
}