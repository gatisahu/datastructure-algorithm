/**
 * 
 */
package com.gati.dsalgo.matrix;

/**
 * @author sahug
 *
 */
public class FindShortestPath {

	// These arrays are used to get row and column
	// numbers of 4 neighbours of a given cell
	static int rowNum[] = { -1, 0, 0, 1 };
	static int colNum[] = { 0, -1, 1, 0 };

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// input matrix with landmines shown with number 0
		int mat[][] = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 1, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 } };

		// find shortest path
		findShortestPath(mat);

	}

	private static void findShortestPath(int[][] mat) {
		// stores minimum cost of shortest path so far
		int min_dist = Integer.MIN_VALUE;

		// create a boolean matrix to store info about
		// cells already visited in current route
		int R = mat.length;
		int C = mat[0].length;
		int visited[][] = new int[R][C];

		// mark adjacent cells of landmines as unsafe
		markUnsafeCells(mat, R, C);

		// start from first column and take minimum
		for (int i = 0; i < R; i++) {
			// if path is safe from current cell
			if (mat[i][0] == 1) {

				// find shortest route from (i, 0) to any
				// cell of last column (x, C - 1) where
				// 0 <= x < R
				findShortestPathUtil(mat, visited, i, 0, min_dist, 0, C, R);

				// if min distance is already found
				if (min_dist == C - 1)
					break;
			}
		}

	}

	// Function to find shortest safe Route in the
	// matrix with landmines
	// mat[][] - binary input matrix with safe cells marked as 1
	// visited[][] - store info about cells already visited in
	// current route
	// (i, j) are cordinates of the current cell
	// min_dist --> stores minimum cost of shortest path so far
	// dist --> stores current path cost
	static void findShortestPathUtil(int mat[][], int visited[][], int i, int j, int min_dist, int dist, int C, int R) {
		// if destination is reached
		if (j == C - 1) {
			// update shortest path found so far
			min_dist = Math.min(dist, min_dist);
			return;
		}

		// if current path cost exceeds minimum so far
		if (dist > min_dist)
			return;

		// include (i, j) in current path
		visited[i][j] = 1;

		// Recurse for all safe adjacent neighbours
		for (int k = 0; k < 4; k++) {
			if (isValid(i + rowNum[k], j + colNum[k], C, R) && isSafe(mat, visited, i + rowNum[k], j + colNum[k])) {
				findShortestPathUtil(mat, visited, i + rowNum[k], j + colNum[k], min_dist, dist + 1, C, R);
			}
		}

		// Backtrack
		visited[i][j] = 0;
	}

	// A function to check if a given cell (x, y)
	// can be visited or not
	static boolean isSafe(int mat[][], int visited[][], int x, int y) {
		if (mat[x][y] == 0 || visited[x][y] == 1)
			return false;

		return true;
	}

	// A function to check if a given cell (x, y) is
	// a valid cell or not
	static boolean isValid(int x, int y, int R, int C) {
		if (x < R && y < C && x >= 0 && y >= 0)
			return true;

		return false;
	}

	// A function to mark all adjacent cells of
	// landmines as unsafe. Landmines are shown with
	// number 0
	static void markUnsafeCells(int mat[][], int R, int C) {
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				// if a landmines is found
				if (mat[i][j] == 0) {
					// mark all adjacent cells
					for (int k = 0; k < 4; k++)
						if (isValid(i + rowNum[k], j + colNum[k], R, C))
							mat[i + rowNum[k]][j + colNum[k]] = -1;
				}
			}
		}

		// mark all found adjacent cells as unsafe
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (mat[i][j] == -1)
					mat[i][j] = 0;
			}
		}

		// Uncomment below lines to print the path
		/*
		 * for (int i = 0; i < R; i++) { for (int j = 0; j < C; j++) { cout <<
		 * std::setw(3) << mat[i][j]; } cout << endl; }
		 */
	}
}
