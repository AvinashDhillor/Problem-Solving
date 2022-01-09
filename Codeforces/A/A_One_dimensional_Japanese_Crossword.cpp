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
  int size;
  string s;
  cin >> size >> s;
  vector<int> A;
  for (int i = 0; i < size; i++) {
    int count = 0;
    while (s[i++] == 'B') count++;
    if (count) A.push_back(count);
    i--;
  }
  cout << A.size() << endl;
  for (int i : A) cout << i << " ";
  return 0;
}