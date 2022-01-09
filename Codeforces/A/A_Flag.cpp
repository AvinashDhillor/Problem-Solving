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

  int n, m;
  cin >> n >> m;
  vector<bool> B(10, true);
  char prev = ' ';
  for (int i = 0; i < n; i++) {
    string s;
    cin >> s;
    set<char> A(all(s));
    if (A.size() != 1 || s[0] == prev) return cout << "NO", 0;
    prev = s[0];
  }
  cout << "YES";
  return 0;
}