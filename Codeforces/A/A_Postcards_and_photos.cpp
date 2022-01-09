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

  string tmp = "";
  for (int i = 0; i < s.size(); i++) {
    char k = s[i];
    tmp += k;
    int an = i + 1, size = 1;
    while (an < s.size() && (k == s[an] && size < 5)) {
      an++, size++;
    }
    i = an - 1;
  }
  cout << tmp.size();
  return 0;
}