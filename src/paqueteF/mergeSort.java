package paqueteF;

import java.util.Scanner;

/**
 *
 * @author Fernanda
 */
public class mergeSort {
	   
	        public static void main(String[] args) 
		{
			int length_of_array;
			Scanner in=new Scanner(System.in);
			length_of_array=in.nextInt();
			int A []=new int[length_of_array],i;
	                long tiempo1=System.nanoTime();
	                
			for(i=0;i<length_of_array;++i)
			{
				A[i]=(int)(Math.random()*10000);
				System.out.print(A[i]+" ");
			}
			A=MergeSort(A);
			System.out.println();
	                long tiempo2=System.nanoTime();
	                long tiempoT=tiempo2-tiempo1;
	                System.out.println(tiempoT/1E9);
			for(i=0;i<length_of_array;++i)
			{
				System.out.print(A[i]+" ");
			}
	                
		}
		public static int[] MergeSort(int [] A)
		{
			if(A.length==1)
			return A;
			else
			{
				int n=(int) Math.floor(A.length/2);
				int B []=new int [n];
				int C []=new int [A.length-n];
				int i;
				for(i=0;i<A.length;++i)
				{
					if(i<n)
						B[i]=A[i];
					else
						C[i-n]=A[i];
				}
				B=MergeSort(B);
				C=MergeSort(C);
				A=Merge(B,C);
				return A;
			}
		}
		public static int [] Merge(int [] A,int [] B)
		{
			int C []=new int [A.length+B.length];
			int i,a=0,b=0;
			for(i=0;i<A.length+B.length;++i)
			{
				if(a==A.length)
				{
					C[i]=B[b];
					++b;
				}
				else 
				if(b==B.length)
				{
					C[i]=A[a];
					++a;
				}
				else 
				if(A[a]>B[b])
				{
					C[i]=B[b];
					++b;
				}
				else
				{
					C[i]=A[a];
					++a;
				}
			}
			return C;		
		}
	}