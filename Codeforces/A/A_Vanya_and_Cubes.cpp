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

  int prev = 0, sol = 0, i;

  for (i = 1; sol <= n; i++) {
    sol += prev + i;
    prev = prev + i;
  }

  cout << i - 2 << endl;

  return 0;
}