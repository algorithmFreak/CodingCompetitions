package com.acc.rahul.topCoder;
public class Rotating2DNonSquareMatrix {

	private int[][] matrix;
	private int rows;
	private int cols;
	 
	public Rotating2DNonSquareMatrix(int[][] matrix, int rows, int cols){
		 this.matrix= matrix;
		 this.rows=rows;
		 this.cols=cols;
	 }
	
	public void shift(int[][] A, int start, int end, boolean left, boolean right){
		
		if(left){
			shiftLeft(A,start,end);
		}
		if(right){
			shiftRight(A,start,end);
		}
		
	}
		 
	public void shiftRight(int[][] A, int start, int end){
		if(start==end){
			return;
		}
		
		int i=start;
		int j= start;
			while(i<end && i<rows){
				//swap(A[i][j],A[i+1][j]);
				int temp =A[i][j];
				A[i][j]=A[i+1][j];
				A[i+1][j]=temp;
				
				i++;
			}
		
		
	
			while(j<end && j<cols){
				//swap(A[i][j],A[i][j+1]);
				int temp =A[i][j];
				A[i][j]=A[i][j+1];
				A[i][j+1]=temp;
				
				j++;
			}
	
		
	
			while(i>start){
				//swap(A[i][j],A[i-1][j]);
				int temp =A[i][j];
				A[i][j]=A[i-1][j];
				A[i-1][j]=temp;
				
				i--;
			}
	
		
	
			while(j>start+1){
				//swap(A[i][j],A[i][j-1]);
				int temp =A[i][j];
				A[i][j]=A[i][j-1];
				A[i][j-1]=temp;
				
				j--;
			}
	
			cols--;rows--;
			shiftLeft(A,start+1,end-1);
	}
		
		
		
	
	
	public void shiftLeft(int[][] A, int start, int end){
		if(start>=end){
			return;
		}
		
		int i=start;
		int j= start;

			while(j<end && j<cols){
				//swap(A[i][j],A[i][j+1]);
				int temp =A[i][j];
				A[i][j]=A[i][j+1];
				A[i][j+1]=temp;
				
				j++;
			}
	
		
	
			while(i<end && i<rows){
				//swap(A[i][j],A[i+1][j]);
				int temp =A[i][j];
				A[i][j]=A[i+1][j];
				A[i+1][j]=temp;
				
				i++;
			}
	
		
	
			while(j>start){
				//swap(A[i][j],A[i][j-1]);
				int temp =A[i][j];
				A[i][j]=A[i][j-1];
				A[i][j-1]=temp;
				
				j--;
			}

			
			while(i>start+1){
				//swap(A[i][j],A[i-1][j]);
				int temp =A[i][j];
				A[i][j]=A[i-1][j];
				A[i-1][j]=temp;
				
				i--;
			}
	
			cols--;rows--;
			shiftRight(A,start+1,end-1);
			
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n=6,m=6, x=11;
		int[][] matrix = new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				matrix[i][j]=x;
				x++;
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(matrix[i][j]+"   ");
			}
			System.out.println();
		}
		
		
		Rotating2DNonSquareMatrix rotating2DArray = new Rotating2DNonSquareMatrix(matrix,n-1,m-1);
		rotating2DArray.shift(matrix, 0, m-1, true, false);		
	//	rotating2DArray.shift(matrix, 0, m-1, false, true);
		System.out.println("----------------------");
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(matrix[i][j]+"   ");
			}
			System.out.println();
		}
	}

}
