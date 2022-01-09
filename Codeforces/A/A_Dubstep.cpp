#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    string s;
    cin >> s;
    int index = s.find("WUB");
    while (index != string::npos) {
        s[index - 1] == ' ' ? s.replace(index, 3, "") : s.replace(index, 3, " ");
        index = s.find("WUB");
    }

    cout << s << endl;

    return 0;
}