package com.LIS;

public class LIS {
	public static void main(String[] args) {
		int[] arr= {2,12,25,9,35,49,33};
	    int n=arr.length;
		
		System.out.println("Longest Increasing Subsequence is");
		int lis[]=new int[n];
		int i,j,max=0;
		
		
		for(i=0;i<n;i++) {
			lis[i]=arr[i];
		}
		
			for(i=1;i<n;i++) {
				for(j=0;j<i;j++) {
					if(arr[i]>arr[j] && lis[i]<lis[j]) {
						lis[i]=lis[j]+1;
					}
				}
			}
						for(i=0;i<n;i++) {
							if(max<lis[i]) {
								max=lis[i];
								System.out.print(max +" ");
								
								
							}
							
						}					
}	
		
}



	


	
	