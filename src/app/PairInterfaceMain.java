package app;

import pair.ArrayPair;
import pair.BasicPair;
import pair.PairInterface;

public class PairInterfaceMain {
  public static void main(String[] args){
    PairInterface<String> pair = new BasicPair<>();
    pair.pair("cats", "dogs");
    System.out.println(pair.getFirst());
    pair.setSecond("birds");
    System.out.println(pair.getSecond());

    PairInterface<String> arrPair = new ArrayPair<>();
    arrPair.pair("java", "c");
    System.out.println(arrPair.getFirst());
    arrPair.setSecond("flutter");
    System.out.println(arrPair.getSecond());
  }
}
