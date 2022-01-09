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

  int sum = 0, k;
  for (int i = 0; i < 5; i++) {
    cin >> k;
    sum += k;
  }
  if (sum / 5 * 5 != sum || sum == 0)
    cout << -1;
  else
    cout << sum / 5;
  return 0;
}