public class AllTheColorsOfTheRainbow {
  int anIntegerRepresentingColors;

  void changeTheHueOfTheColor(int newHue) {
    anIntegerRepresentingColors += newHue;
  }

  public String toString() {
    return (""+anIntegerRepresentingColors);
  }

  public static void main (String [] args) {
    AllTheColorsOfTheRainbow a = new AllTheColorsOfTheRainbow ();
    a.changeTheHueOfTheColor(-10);
    System.out.println("new color is: "+a);
  }

}
