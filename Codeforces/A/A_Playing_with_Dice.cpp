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
  int a, b, one = 0, two = 0, draw = 0;
  cin >> a >> b;

  for (int i = 1; i <= 6; i++) {
    if (abs(i - a) == abs(i - b))
      draw++;
    else if (abs(i - a) < abs(i - b))
      one++;
    else
      two++;
  }
  cout << one << " " << draw << " " << two;
  return 0;
}