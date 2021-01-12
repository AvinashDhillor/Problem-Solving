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
  cin >> size;
  vector<char> A(size);
  int l_count = 0, r_count = 0;
  for (int i = 0; i < size; i++) {
    cin >> A[i];
    if (A[i] == 'L') l_count++;
    if (A[i] == 'R') r_count++;
  }

  int x, y;
  if (l_count == 0) {
    int i = 0;
    while (A[i] == '.') {
      i++;
    }
    x = i;
    while (i < size && A[i] == 'R') i++;
    if (i == size)
      y = i - 1;
    else
      y = i;
  } else if (r_count == 0) {
    int i = size - 1;
    while (A[i] == '.') {
      i--;
    }
    x = i;
    while (i >= 0 && A[i] == 'L') i--;
    if (i < 0)
      y = i + 1;
    else
      y = i;
  } else {
    int i = 0;
    while (A[i] != 'R') i++;
    x = i;
    while (i < size && A[i] != 'L') i++;
    y = i - 1;
  }
  cout << x + 1 << " " << y + 1;
  return 0;
}