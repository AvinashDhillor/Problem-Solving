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

  set<string> grumpy = {"no",     "nod bad",       "cool", "don't touch me!",
                        "great!", "don't think so"},
              normal = {
                  "no",    "no way",   "go die in a hole", "are you serious?",
                  "worse", "terrible", "don't even"};
  int gscore = 0, nscore = 0;
  for (int i = 0; i < 10; i++) {
    cout << i << endl;
    string s;
    getline(cin, s);
    if (grumpy.find("s") != grumpy.end()) gscore++;
    if (normal.find("s") != normal.end()) nscore++;
  }

  cout << (gscore > nscore ? "grumpy" : "normal");

  return 0;
}