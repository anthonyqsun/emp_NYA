public class SearchDriver{
  // Driver Class
  private Comparable[] arr;
  private static long startTime;
  private static long endTime;

  public SearchDriver(int len) {
    arr = new Comparable[len];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = i;
    }
  }

  public static void main(String[] args) {
    int[] arrLength = {500000,5000000,100000000};

    for (int len : arrLength) {
      SearchDriver search = new SearchDriver(len);

      long linAcc = 0; //accumulative
      long binAcc = 0;

      int[] targets = new int[100];
      for (int i = 0; i < 100; i++) {
          targets[i] = (int) (Math.random()*len);
      }

      for (int _x = 0; _x < 100; _x++) {
        for (int i : targets) {
          startTime = System.currentTimeMillis();
          LinSearch.linSearch(search.arr, i);
          endTime = System.currentTimeMillis();
          linAcc += (endTime-startTime);

          startTime = System.currentTimeMillis();
          BinSearch.binSearch(search.arr, i);
          endTime = System.currentTimeMillis();
          binAcc += (endTime-startTime);
        }
      }

      long linAvg = linAcc/(long) len;
      long binAvg = binAcc/(long) len;

      System.out.println("Average time for LinSearch: "+linAvg);
      System.out.println("Average time for BinSearch: "+binAvg);
      System.out.println("BinSearch is "+(linAvg)/(binAvg)+" times faster than LinSearch");

      System.out.println(endTime-startTime);
    }
  }
}
