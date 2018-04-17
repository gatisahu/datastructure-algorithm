/**
 * 
 */
package com.gati.dsalgo.graph;

/**
 * @author sahug
 *
 */
public class Islands {
	
	private final int x [] ={-1,-1,-1,0,1,1,1,0};
	private final int y [] ={-1, 0, 1,1,1,0,-1,-1};
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int M[][] = new int[][] { { 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 1 }, { 1, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 },
				{ 1, 0, 1, 0, 1 } };
		Islands I = new Islands();
		System.out.println("Number of islands is: " + I.countIslands(M));
	}

	private String countIslands(int[][] m) {
		int row =m.length;
		int column=m[0].length;
		int visit[][] =new int[row][column];
		for(int i=0;i<row;i++){
			for(int j=0;j<column;j++){
				if(m[i][j] ==1){
					DFSUtil(m,i,j,visit);
				}
			}
		}
		return null;
	}

	private void DFSUtil(int[][] m, int i, int j, int[][] visit) {
		visit[i][j]=1;
		for(int k=0;k<8;k++){
			if(isSafe(m)){
				DFSUtil(m, i+x[k], j+y[k], visit);
			}
		}
		
	}

	private boolean isSafe(int[][] m) {
		// TODO Auto-generated method stub
		return false;
	}

}
