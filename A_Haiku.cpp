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

  string a, b, c, d = "aeiou";
  getline(cin, a);
  getline(cin, b);
  getline(cin, c);

  auto _V = [&](string s) {
    int ct = 0;
    for (auto c : s) d.find(c) != string::npos && ++ct;
    return ct;
  };
  cout << (_V(a) == _V(c) == 5 and _V(b) == 7 ? "YES " : "NO");

  return 0;
}