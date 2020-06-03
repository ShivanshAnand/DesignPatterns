/* this is the main class which gets executed first
 * author = Shivansh Anand */


public class Initiater {
  
  public static void main(String args[]) {
    ArrayUtils arru = new ArrayUtils();
    arru.setSortingMethod(new BubbleSort());
    int arr1 [] = {1,4,5,2};
    int arr[] = arru.performSort(arr1);
    
    for(int i=0; i<arr.length; i++) {
      System.out.print(arr[i] + "  ");
    }
    
    System.out.println();
    
    /*Now if we want to have a different sorting behaviour instead of editing any other previous classes i.e. adding conditional variables in performSort method
     * of ArrayUtils class to do sorting in descending order or modifying BubbleSort sort's method ( which isn't possible as it will require to modify sort method
     * in the interface ), we can simply create a new class ( BubbleSortDesc ) and pass it into the ArrayUtils class which asssigns it to the list interface, thus
     * we are programming to an interface not to an implementation and our code is well encapsulated and highly maintainable.
     * */
    
    arru.setSortingMethod(new BubbleSortDesc());
    int arr2[] = arru.performSort(arr1);
    
    for(int i=0; i<arr2.length; i++) {
      System.out.print(arr2[i] + "  ");
    }
    
  }
}