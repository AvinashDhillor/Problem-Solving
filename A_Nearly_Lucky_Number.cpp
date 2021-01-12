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
  map<char, int> A;
  for (char c : s) A[c]++;
  string one = to_string(A['4'] + A['7']);
  for (char c : one)
    if (c != '4' && c != '7') return cout << "NO", 0;

  cout << "YES";
  return 0;
}