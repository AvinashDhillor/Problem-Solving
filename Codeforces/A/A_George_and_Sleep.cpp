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
  string a, b, c, d;
  getline(cin, a, ':');
  getline(cin, b);
  getline(cin, c, ':');
  getline(cin, d);
  int p = stoi(a), q = stoi(b), r = stoi(c), s = stoi(d);
  int minut = q - s;
  if (minut < 0) minut = 60 + minut, p--;

  int hour = p - r;
  if (hour < 0) hour = 24 + hour;
  a = to_string(hour);
  b = to_string(minut);
  cout << (a.size() == 1 ? "0" + a : a) << ":";
  cout << (b.size() == 1 ? "0" + b : b);

  return 0;
}