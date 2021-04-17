#include <bits/stdc++.h>

using namespace std;

#define endl "\n"
#define ll long long
#define all(v) (v).begin(), (v).end()
#define allr(v) (v).rbegin(), (v).rend()

void solve() {
}

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);

    cout << "hello";

    return 0;
}

// #include <bits/stdc++.h>

// using namespace std;

// #define endl "\n"
// #define ll long long
// #define all(v) (v).begin(), (v).end()
// #define allr(v) (v).rbegin(), (v).rend()

// void addEdge(int u, int v, vector<vector<int>> &A) {
//     A[u].push_back(v);
//     A[v].push_back(u);
// }

// void pr(vector<int> &stack) {
//     for (auto it : stack) {
//         cout << it << " ";
//     }
// }

// void dfsutil(int u, int v, vector<vector<int>> &A, bool *visited, vector<int> &stack) {

//     stack.push_back(u);
//     visited[u] = true;

//     if (u == v) {
//         pr(stack);
//         return;
//     }

//     for (auto i = 0; i < A[u].size(); i++) {
//         if (!visited[A[u][i]]) {
//             dfsutil(A[u][i], v, A, visited, stack);
//         }
//     }

//     stack.pop_back();
// }

// void dfs(int u, int v, vector<vector<int>> &A) {
//     bool visited[A.size()];
//     vector<int> stack;
//     memset(visited, sizeof visited, false);
//     dfsutil(u, v, A, visited, stack);
// }

// int main() {
//     ios::sync_with_stdio(0);
//     cin.tie(0);
//     cout.tie(0);

//     vector<vector<int>> A(7);
//     addEdge(1, 2, A);
//     addEdge(1, 3, A);
//     addEdge(2, 4, A);
//     addEdge(2, 5, A);
//     addEdge(3, 6, A);

//     dfs(4, 6, A);
//     return 0;
// }