class TransposeMatrix{


public static void main(String args[]){
  int a[][] = {{9,8,7},{6,5,4},{3,2,1}};
  
  System.out.println("Before Transpose Matrix");
      for(int i=0;i<a.length;i++){
	     for(int j=0;j<a.length;j++){
			 //b[j][i]=a[i][j];
			 System.out.print(a[i][j]+ "  ");
		 }
		System.out.println(); 
	  
	  }
 
  
  //int b[][] = new int [3][3];
    System.out.println("after Transpose Matrix");
      for(int i=0;i<a.length;i++){
	     for(int j=0;j<a.length;j++){
			 //b[j][i]=a[i][j];
			 System.out.print(a[j][i]+ "  ");
		 }
		System.out.println(); 
	  
	  }
}
}
