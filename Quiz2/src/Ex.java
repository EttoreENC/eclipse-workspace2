
public class Ex {

	
	
	public static void main ( int [ ] [ ] x ) {
		    for ( int i = 0 ; i < x.length ; i ++ ) {
		       for ( int j = 0 ; j < x [ i ] .length ; j ++ ) {
		            if ( i < j ) {
		                x [ i ] [ j ] = 2* i + 7 * j - 2 ;
		            } else if ( i == j ) {
		                x [ i ] [ j ] = 3 * i * i -1;
		              }else if ( i > j ) {

		                x [ i ] [ j ] = 4 * i * i * i -5 * j * j ; 
		}
		}
		}
		}
}
