//write a program for multiply matrix.


class MatrixMultiplication{
	
	//for matrix multiplication column of 1st matrix = row of 2nd matrix
	public static void main(String args[]){
		int a[][] = {{2,4,6},{1,2,4}};
		int b[][] = {{1,2},{4,5},{1,5}};
		int c[][] = new int[3][3];  //size of resultant matrix depends on row of 1st matrix i.e 3 here 
		  int sum=0;
		  for(int i=0;i<a.length;i++){
			  for(int j=0;j<b.length;j++){
				  for(int k=0;k<2;k++){
					 sum = sum + a[i][k]*b[k][j];
				  }
				  c[i][j]=sum;
				  sum=0;
			  }
			 
		  }
		 
		 // for(int i=0;i<c.length;i++){
			 // for(int j=0;j<c.length;j++){
				 // c[i][j]=a[i][j]*b[i][j];
			 // }
		 // }
		 
		 for(int i=0; i<c.length; i++){
            for(int j=0;j<c.length;j++){
             System.out.print(c[i][j] + " ");
            }
		     System.out.println();
        }
		 
		
	}
	}
	
