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
  int s;
  cin >> s;
  s++;
  set<char> A;
  while (true) {
    string tmp = to_string(s);
    A = set<char>(tmp.begin(), tmp.end());
    if (A.size() == 4) break;
    s++;
  }
  cout << s << endl;
  return 0;
}