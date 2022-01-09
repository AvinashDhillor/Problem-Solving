#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

class cor {
public:
    int x, y;
    cor(int X, int Y) {
        x = X;
        y = Y;
    }
};

char find(map<char, cor *> &m, char b[][10], char c, char type) {
    cor *tmp = m[c];
    if (type == 'R')
        return b[tmp->x][tmp->y - 1];
    return b[tmp->x][tmp->y + 1];
}

int main() {
    string a = "qwertyuiop", b = "asdfghjkl;", c = "zxcvbnm,./";

    char arr[3][10];

    map<char, cor *> m;
    for (int i = 0; i < 10; i++) {
        arr[0][i] = a[i];
        m[a[i]] = new cor(0, i);
        arr[1][i] = b[i];
        m[b[i]] = new cor(1, i);
        arr[2][i] = c[i];
        m[c[i]] = new cor(2, i);
    }
    char in;
    cin >> in;
    string s;
    cin >> s;

    for (int i = 0; i < s.size(); i++) {
        cout << find(m, arr, s[i], in);
    }

    return 0;
}