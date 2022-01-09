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
  int val = 0, x;
  cin >> x;
  while (x--) {
    string s;
    cin >> s;
    s == "X++" || s == "++X" ? val++ : val--;
  }
  cout << val;
  return 0;
}