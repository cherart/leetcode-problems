package medium

/*
200. Number of Islands

Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input:
11110
11010
11000
00000

Output: 1

Example 2:

Input:
11000
11000
00100
00011

Output: 3
*/

fun numIslands(grid: Array<CharArray>): Int {
    var result = 0

    for (i in grid.indices) {
        for (j in grid[i].indices) {
            if (grid[i][j] == '1') {
                result++
                dfs(i, j, grid)
            }
        }
    }
    return result
}

fun dfs(i: Int, j: Int, grid: Array<CharArray>) {
    if (i < 0 || j < 0 || i > grid.lastIndex || j > grid[i].lastIndex || grid[i][j] == '0')
        return
    grid[i][j] = '0'
    dfs(i - 1, j, grid)
    dfs(i + 1, j, grid)
    dfs(i, j - 1, grid)
    dfs(i, j + 1, grid)
}