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

  map<int, string> A = {
      {0, "zero"},     {1, "one"},        {2, "two"},       {3, "three"},
      {4, "four"},     {5, "five"},       {6, "six"},       {7, "seven"},
      {8, "eight"},    {9, "nine"},       {10, "ten"},      {11, "eleven"},
      {12, "twelve"},  {13, "thirteen"},  {14, "fourteen"}, {15, "fifteen"},
      {16, "sixteen"}, {17, "seventeen"}, {18, "eighteen"}, {19, "nineteen"},
      {20, "twenty"},  {30, "thirty"},    {40, "forty"},    {50, "fifty"},
      {60, "sixty"},   {70, "seventy"},   {80, "eighty"},   {90, "ninety"}};

  int n;
  cin >> n;
  if (n <= 20 || n % 10 == 0)
    cout << A[n];
  else
    cout << A[n / 10 * 10] << "-" << A[n % 10];

  return 0;
}