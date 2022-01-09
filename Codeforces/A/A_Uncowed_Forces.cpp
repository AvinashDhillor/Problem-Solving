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
  auto _s = [](int x, int m, int w) {
    int a = ceil(0.3 * (double)x), b = (x - (x / 250) * m) - 50 * w;
    return max(a, b);
  };

  vector<int> time(5), sub(5);
  for (int &i : time) cin >> i;
  for (int &i : sub) cin >> i;
  int un, sn;
  cin >> un >> sn;

  int score = 0;
  for (int i = 0, point = 500; i < 5; i++, point += 500) {
    score += _s(point, time[i], sub[i]);
  }

  cout << score + un * 100 - sn * 50;
  return 0;
}