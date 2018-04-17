/**
 * 
 */
package com.gati.dsalgo.matrix;

import java.util.Scanner;

/**
 * @author sahug
 *
 */
public class FindPathInAGrid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] input = new int[N][N];
		for (int i = 0; i < N; i++) {
			String str = in.next();
			for (int j = 0; j < N; j++) {
				if (str.charAt(j) == 'X') {
					input[i][j] = 0;
				} else {
					input[i][j] = 1;
				}
			}
		}
		int x1 = in.nextInt();
		int x2 = in.nextInt();
		int y1 = in.nextInt();
		int y2 = in.nextInt();
		int sol[][] = new int[N][N];
		if (solveMaze(input, sol, x1, x2, y1, y2)) {
			System.out.println();
		}
	}

	private static boolean solveMaze(int[][] maze, int sol[][], int x1, int x2, int y1, int y2) {
		int N = maze.length;

		if (solveMazeUtil(maze, x1, y1, sol, N, x2, y2) == false) {
			System.out.print("Solution doesn't exist");
			return false;
		}
		return true;
	}

	private static boolean solveMazeUtil(int[][] maze, int x, int y, int[][] sol, int N, int x2, int y2) {
		// if (x,y is goal) return true
		if (x == x2 && y == y2) {
			sol[x][y] = 1;
			return true;
		}

		// Check if maze[x][y] is valid
		if (isSafe(maze, x, y, N) == true) {
			// mark x,y as part of solution path
			sol[x][y] = 1;

			/* Move forward in x direction */
			if (solveMazeUtil(maze, x + 1, y, sol, N, x2, y2))
				return true;

			/*
			 * If moving in x direction doesn't give solution then Move down in
			 * y direction
			 */
			if (solveMazeUtil(maze, x, y + 1, sol, N, x2, y2))
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

	private static boolean isSafe(int[][] maze, int x, int y, int N) {
		// if (x,y outside maze) return false
		return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
	}
}
