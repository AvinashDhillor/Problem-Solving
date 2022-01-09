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
  int n, one = 0, zero = 0;
  cin >> n;
  string s;
  cin >> s;
  for (char c : s) c == '1' ? one++ : zero++;
  cout << abs(one - zero);
  return 0;
}