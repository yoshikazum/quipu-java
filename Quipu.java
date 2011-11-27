public class Quipu {
  /*
   * goodplus has submitted the 250-point problem for 142.00 points
   */
  public int readKnots(String knots) {
    char[] c = knots.toCharArray();
    int number = 0;
    int zeroNumber = -1;
    String numbersString = "";
    for (int i = 0; i < c.length; i++) {
      char d = c[i];
      if (d == 'X') {
        if(zeroNumber > 0){
          for (int j = 0; j < zeroNumber; j++) {
            numbersString += "0";
          }
        }
        number++;
        zeroNumber = -1;
      }
      if (d == '-') {
        if(number!=0){
          numbersString += String.valueOf(number);
        }
        number = 0;
        zeroNumber++;
      }
    }
    
    if(zeroNumber > 0){
      for (int j = 0; j < zeroNumber; j++) {
        numbersString += "0";
      }
    }
    return Integer.valueOf(numbersString);
  }

}
