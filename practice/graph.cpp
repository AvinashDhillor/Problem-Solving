#include<bits/stdc++.h>

using namespace std;

void countIslands(vector<vector<char>>& grid, int m, int n) {
    if(m < 0 or n < 0 or m >= grid.size() or n >= grid[0].size() or grid[m][n] != '1') return;

    grid[m][n] = '#';

    int directions[4][4] = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    for(int i = 0; i < 4; i++) {
        countIslands(grid, m + directions[i][0], n  + directions[i][1]);
    }   

}

int numIslands(vector<vector<char>>& grid) {
    int m = grid.size();    
    int n = grid[0].size();
    int count = 0;
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            if(grid[i][j] == '1') {
                countIslands(grid, i, j);
                count++;
            }
        }
    }
    return count;
}


int main() {

    int count = 0;
    int m = 10;
    int n = 10;
    vector<vector<bool>> visited(m, vector<bool>(n, false));


    return 0;
}