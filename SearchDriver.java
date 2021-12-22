/*
TNPG : NYA | Roster: Anthony Sun + Corn, Nakib Abedin + Joker
APCS pd06
lab02 -- BinSearch vs LinSearch
2021-12-16
Time Spent: 2.8 hrs
*/

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
    int[] arrLength = {500000,1000000,2000000};

    for (int len : arrLength) {
      SearchDriver search = new SearchDriver(len);

      long linAcc = 0; //accumulative
      long binAcc = 0;

      int[] targets = new int[1000];
      for (int i = 0; i < 1000; i++) {
          targets[i] = (int) (Math.random()*len);
      }

      for (int _x = 0; _x < 70; _x++) {
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
        System.out.println("reached iteration #"+_x); //keeps track of progress
      }

      System.out.println("Total amt of time spent on LinSearch: "+linAcc);
      System.out.println("Total amt of time spent on BinSearch: "+binAcc);

      System.out.println("BinSearch is "+(linAcc)/(binAcc)+" times faster than LinSearch for "+len+" values.");
    }
  }
}
