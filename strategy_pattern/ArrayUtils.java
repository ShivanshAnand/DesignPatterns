public class ArrayUtils {
  
  Sort sort;
  
  public void setSortingMethod(Sort sort) {
    this.sort = sort;
  }
  
  public int[] performSort(int arr[]) {
    return sort.sort(arr);
  }
}
