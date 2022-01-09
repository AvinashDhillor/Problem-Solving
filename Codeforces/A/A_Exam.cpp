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

  int n, i = 0;
  cin >> n;
  if (n == 1 || n == 2)
    cout << "1\n1";
  else if (n == 3)
    cout << "2\n1 3";
  else if (n == 4)
    cout << "4\n3 1 4 2";
  else {
    cout << n << endl;
    while (2 * i + 1 <= n) cout << (2 * i++ + 1) << " ";
    i = 1;
    while (2 * i <= n) cout << (2 * i++) << " ";
  }

  return 0;
}