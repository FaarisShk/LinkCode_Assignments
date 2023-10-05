
public class Problem_10 {
	int i,j;
	int myarr[][] = new int[10][10];
	public Problem_10(){
		for(i=0;i<myarr.length;i++) {
			for(j=0;j<myarr.length;j++) {
				myarr[i][j] = 0;
			}
		}
	}
	void setElement(int n1, int n2, int value) {
		myarr[n1][n2] = value;
	}
	
	public void transpose() {
		int transpose[][] = new int [10][10];
		for(i=0;i<myarr.length;i++) {
			for(j=0;j<myarr.length;j++) {
				myarr[i][j] = transpose[j][i];
			}
		}
	}
}
