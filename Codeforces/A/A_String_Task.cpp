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
  string s, sol = "";
  cin >> s;
  for (char c : s) {
    c = tolower(c);
    if (c == 'a' || c == 'o' || c == 'y' || c == 'e' || c == 'u' || c == 'i')
      continue;
    else {
      sol += ".";
      sol += c;
    }
  }
  cout << sol;
  return 0;
}