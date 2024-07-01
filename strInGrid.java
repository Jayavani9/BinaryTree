//https://www.geeksforgeeks.org/problems/find-the-string-in-grid0111/1?page=1&company%5B%5D=Amazon&category%5B%5D=Recursion&sortBy=


class Solution
{
    int[][] dirs;
    public int[][] searchWord(char[][] grid, String word)
    {
        // Code here
        List<int[]> res = new ArrayList<>();
        dirs = new int[][]{{1,1},{-1,-1},{-1,1},{1,-1},{0,1},{1,0},{0,-1},{-1,0}};
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(word.charAt(0) == grid[i][j])
                {
                    if(dfs(grid,word,i,j)) res.add(new int[]{i,j});
                }
            }
        }
    
    res.sort(Comparator.comparingInt((int[] arr) -> arr[0])
    .thenComparingInt(arr->arr[1]));
    
    int[][] resArr = new int[res.size()][2];
    for(int i = 0; i < res.size(); i++)
    {
        resArr[i] = res.get(i);
    }
    return resArr;
    
    }
    
    private boolean dfs(char[][] grid, String word, int i, int j)
    {
        int m = grid.length;
        int n = grid[0].length;
        int len = word.length();
        
        for(int[] dir: dirs)
        {
            int k, nr = i, nc = j;
            for (k = 0; k < len; k++) {
                if (nr < 0 || nr >= m || nc < 0 || nc >= n || grid[nr][nc] != word.charAt(k)) {
                    break;
                }
                nr += dir[0];
                nc += dir[1];
            }
            if (k == len) {
                return true;
            }
        }
        return false;
    }
}
