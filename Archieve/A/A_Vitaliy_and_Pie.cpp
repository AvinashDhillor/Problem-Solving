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

  int n, count = 0;
  cin >> n;
  string s;
  cin >> s;
  map<char, int> A;
  for (int i = 0; i < s.size(); i++) {
    if (i & 1) {
      s[i] = tolower(s[i]);
      if (A.find(s[i]) != A.end()) {
        A[s[i]]--;
        if (A[s[i]] == 0) A.erase(A.find(s[i]));
      } else
        count++;
    } else
      A[s[i]]++;
  }

  cout << count;

  return 0;
}