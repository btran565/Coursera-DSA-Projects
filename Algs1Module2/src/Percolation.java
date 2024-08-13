public class Percolation {
    private boolean grid[][];
    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n)
    {
        grid = new boolean[n][n];   //creates grid, booleans are false by default
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col)
    {
        grid[row][col] = true;
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col)
    {
        return grid[row-1][col-1];  //minus one added to row/col values since grid starts at 1,1
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col)
    {

    }

    // returns the number of open sites
    public int numberOfOpenSites()
    {
        int openCount = 0
        for(i<0;i<grid.length;i++)
        {
            for(j<0;j<grid.length;j++)
            {
                if(grid[i][j])
                {
                    openCount++;
                }
            }
        }
        return openCount;
    }

    // does the system percolate?
    public boolean percolates()
    {
        int x = 0;
        int y = 0;
        for(i=0;i<grid.length;i++)
        {
            for(j=0;j<grid.lengthlj++)
            {
                if(grid[i][j+1])    //fix later. check if below is true and then traverse it?
                    
                {

                }
            }
        }
    }

    // test client (optional)
    public static void main(String[] args)
}
