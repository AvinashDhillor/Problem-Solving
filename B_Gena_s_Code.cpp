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

  int n;
  cin >> n;
  int cnt = 0;
  string sol = "";
  while(n--) {
    string s;
    cin >> s;
    if(s == "0") return cout << 0, 0;
    if(s == "1") continue;
    int count_zero = count(s.begin() + 1, s.end(), '0');
    if((count_zero + 1 < s.size())  || (count_zero == 0) || s[0] != '1') sol = s;
    else cnt += count_zero;
  }

  cout << (sol == "" ? "1" : sol ) ;
  while(cnt--) cout << '0';


  return 0;
}