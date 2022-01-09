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
  string s;
  cin >> s;
  for (char c : s)
    if (c == 'H' or c == 'Q' or c == '9') return cout << "YES", 0;

  cout << "NO";
  return 0;
}