public class land{
	public static void print(int[][] arr){
		for (int i = 0; i < arr.length ; i++){
			System.out.print("[");
			for (int e = 0; e < arr[i].length -1 ; e++){
				System.out.print(arr[i][e] + ", ");
			}
			System.out.print(arr[i][arr[i].length -1] + "]");
			System.out.println();
		}
		System.out.println();
	}
	public static void print(int[] arr){
		System.out.print("[");
		for (int i = 0; i < arr.length-1; i++){
			System.out.print(arr[i]+", ");
		}
		System.out.print(arr[arr.length-1] + "]");
		System.out.println();
	}
	public static void main(String[] args){
	int[][] test1 = {
      { 1, 2, 3, 4 } ,
      { 99, 98, 97, 96, 95, 94, 93, 92, 91, 90 }
    } ;
    int[][] test2 = {
      { -1, -2, -3, -4 } ,
      { 2 } ,
      { 5, 10, 15, 20, 25, 30, 35, 40, 100 }
    } ;
    int[][] test3 = {
      { 11, 22, 33, 44, 55, 66, 77, 88, 99 } ,
      { 0 , 19, -5, 31 } ,
      { 10, 100, 1000 } ,
      { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28 }
    } ;

    print(test1);
    print(test2);
    print(test3);
    System.out.println("10: " + ArrayMethods.rowSum(test1, 0));
    System.out.println("945: " +ArrayMethods.rowSum(test1, 1));

    System.out.println("-10: " +ArrayMethods.rowSum(test2, 0));
    System.out.println("2: " + ArrayMethods.rowSum(test2 , 1));
    System.out.println("280: "  + ArrayMethods.rowSum(test2, 2));

    System.out.println(ArrayMethods.rowSum(test3, 0));
    System.out.println(ArrayMethods.rowSum(test3, 1));
    System.out.println(ArrayMethods.rowSum(test3, 2));
    System.out.println(ArrayMethods.rowSum(test3, 3));

    System.out.println();
    System.out.println("column sums");
    print(ArrayMethods.allColSums(test1));
    print(ArrayMethods.allColSums(test2));
    print(ArrayMethods.allColSums(test3));

 	System.out.println("\n" + "row sums");
 	print(ArrayMethods.allRowSums(test1));
    print(ArrayMethods.allRowSums(test2));
    print(ArrayMethods.allRowSums(test3));

    System.out.println("\n" + "are they **magical**?");
    System.out.println(ArrayMethods.isRowMagic(test1));
    System.out.println(ArrayMethods.isRowMagic(test2));
    System.out.println(ArrayMethods.isRowMagic(test3));

    System.out.println("\n looks like we have to make some new arrays for this");
    int[][] magic = {
    	{1,2,3,4,5},
    	{5,4,3,2,1},
    	{1,2,3,4,5},
    	{5,4,3,2,1}
    };
    print (magic);
    System.out.println(ArrayMethods.isRowMagic(magic));
    System.out.println(ArrayMethods.isColumnMagic(magic));
    System.out.println("yay!");
	}
}
