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
  string abc = "hello";

  bool f = true;
  for (int i = 0, ind = 0; i < 5; i++) {
    int tmp = find(s.begin() + ind, s.end(), abc[i]) - s.begin();
    if (tmp == s.size()) f = false;
    ind = tmp + 1;
  }

  cout << (f ? "YES" : "NO");

  return 0;
}