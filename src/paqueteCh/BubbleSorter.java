package paqueteCh;

public class BubbleSorter {
	public static void BubbleSort( Object [ ] num ){
	     int j;
	     boolean flag = true;   // set flag to true to begin first pass
	     int temp;   //holding variable

	     while ( flag ){
	            flag= false;    //set flag to false awaiting a possible swap
	            for( j=0;  j < num.length -1;  j++ ){
	                   if ( Integer.parseInt((num[ j ].toString())) < Integer.parseInt((num[ j+1 ].toString())) ){   // change to > for ascending sort

	                           temp = Integer.parseInt((num[ j ].toString()));                //swap elements
	                           num[ j ] = num[ j+1 ];
	                           num[ j+1 ] = temp;
	                          flag = true;              //shows a swap occurred  
	                  } 
	            } 
	      } 
	     System.out.println(num);
	} 
}
