/* *****************************************************************************
 *  Name:              Agustin Vaca
 *  Coursera User ID:  -
 *  Last modified:     1/1/2019
 **************************************************************************** */

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    //vars
    private WeightedQuickUnionUF wuf;
    private boolean[] openSiteGrid;
    private int size;
    private int counter;

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        wuf = new WeightedQuickUnionUF((n * n) + 2); // 2 extra virtual spaces.
        openSiteGrid = new boolean[(n * n) + 2];     // First and last index respectively.
        size = n;
    }

    public int convertIndex(int row, int col) {
        return (row - 1) * size + col;
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        //TODO: implement all open cases and throw exceptions
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        return openSiteGrid[convertIndex(row, col)];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        return wuf.find(convertIndex(row, col)) == wuf.find(0);
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return counter;
    }

    // does the system percolate?
    public boolean percolates() {
        return wuf.find((size * size) + 1) == wuf.find(0);
    }

}
