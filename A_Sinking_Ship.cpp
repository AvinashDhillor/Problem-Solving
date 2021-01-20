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
  vector<string> first, second, third, forth;

  int t;
  cin >> t;
  while (t--) {
    string x, y;
    cin >> x >> y;
    if (y == "rat")
      first.push_back(x);
    else if (y == "woman" || y == "child")
      second.push_back(x);
    else if (y == "man")
      third.push_back(x);
    else if (y == "captain")
      forth.push_back(x);
  }

  for (string s : first) cout << s << endl;
  for (string s : second) cout << s << endl;
  for (string s : third) cout << s << endl;
  for (string s : forth) cout << s << endl;
  return 0;
}