package com.acc.rahul.topCoder;

public class MinimumSquareEasy {

	int[] x;
	int[] y;
	int N;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MinimumSquareEasy m = new MinimumSquareEasy();
		System.out.println(m.minArea(new int[]{0, 1, 2}, new int[]{0, 1, 5}));
		System.out.println(m.minArea(new int[]{-1, -1, 0, 2, 0}, new int[]{-2, -1, 0, -1, -2}));
		System.out.println(m.minArea(new int[]{1000000000, -1000000000, 1000000000, -1000000000}, new int[]{1000000000, 1000000000, -1000000000, -1000000000}));
		System.out.println(m.minArea(new int[]{93, 34, 12, -11, -7, -21, 51, -22, 59, 74, -19, 29, -56, -95, -96, 9, 44, -37, -54, -21}, new int[]{64, 12, -43, 20, 55, 74, -20, -54, 24, 20, -18, 77, 86, 22, 47, -24, -33, -57, 5, 7}));
		System.out.println();
		System.out.println();
	}
	
	public long minArea(int[] x, int[] y){
		this.x=x;
		this.y=y;
		N = x.length;
		long res = Long.MAX_VALUE;
		
		for(int i=0;i<N-1;i++){
			for(int j=i+1;j<N;j++){
				long val = minSquare(i,j);
				res = (val<res) ? val:res;
			}
		}
	return res;	
	}
	
	public long minSquare(int remove1, int remove2){
		int xmax = Integer.MIN_VALUE, ymax = Integer.MIN_VALUE;
		int xmin = Integer.MAX_VALUE, ymin = Integer.MAX_VALUE;
		long xdiff,ydiff;
		
		for(int i=0;i<this.N;i++){
			if(i==remove1 || i==remove2){
				continue;
			}
			int xi= this.x[i];
			int yi= this.y[i];
			xmax=(xi>xmax)?xi:xmax;
			xmin=(xi<xmin)?xi:xmin;
			ymax=(yi>ymax)?yi:ymax;
			ymin=(yi<ymin)?yi:ymin;
		}
		xdiff = xmax-xmin+2;
		ydiff = ymax-ymin+2;
		return (xdiff>ydiff) ? xdiff*xdiff : ydiff*ydiff;
	}
}
