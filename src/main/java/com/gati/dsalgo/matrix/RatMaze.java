/**
 * 
 */
package com.gati.dsalgo.matrix;

/**
 * @author sahug
 *
 */
public class RatMaze {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RatMaze rat = new RatMaze();
		int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
		rat.solveMaze(maze);

	}

	private boolean solveMaze(int[][] maze) {
		int N=maze.length;
		int sol[][] =new int[N][N];

		if (solveMazeUtil(maze, 0, 0, sol,N) == false) {
			System.out.print("Solution doesn't exist");
			return false;
		}

		printSolution(sol,N);
		return true;
	}

	private void printSolution(int[][] sol,int N) {
		 for (int i = 0; i < N; i++)
	        {
	            for (int j = 0; j < N; j++)
	                System.out.print(" " + sol[i][j] +
	                                 " ");
	            System.out.println();
	        }

	}

	private boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol,int N) {
		// if (x,y is goal) return true
		if (x == N - 1 && y == N - 1) {
			sol[x][y] = 1;
			return true;
		}

		// Check if maze[x][y] is valid
		if (isSafe(maze, x, y,N) == true) {
			// mark x,y as part of solution path
			sol[x][y] = 1;

			/* Move forward in x direction */
			if (solveMazeUtil(maze, x + 1, y, sol,N))
				return true;

			/*
			 * If moving in x direction doesn't give solution then Move down in
			 * y direction
			 */
			if (solveMazeUtil(maze, x, y + 1, sol,N))
				return true;

			/*
			 * If none of the above movements work then BACKTRACK: unmark x,y as
			 * part of solution path
			 */
			sol[x][y] = 0;
			return false;
		}

		return false;
	}

	private boolean isSafe(int[][] maze, int x, int y,int N) {
		 // if (x,y outside maze) return false
        return (x >= 0 && x < N && y >= 0 &&
                y < N && maze[x][y] == 1);
	}

}
