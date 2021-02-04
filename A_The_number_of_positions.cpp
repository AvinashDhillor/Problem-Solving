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

  int n, a, b, s = 0;
  cin >> n >> a >> b;
  for (int i = 1; i <= n; i++)
    if (i - 1 >= a && n - i <= b) s++;
  cout << s;

  return 0;
}