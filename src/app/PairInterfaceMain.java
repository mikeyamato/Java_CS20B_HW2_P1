package app;

import pair.BasicPair;
import pair.PairInterface;

public class PairInterfaceMain {
  public static void main(String[] args){
    PairInterface<String> pair = new BasicPair<>();
    pair.pair("cats", "dogs");
    System.out.println(pair.getFirst());
    pair.setSecond("birds");
    System.out.println(pair.getSecond());
  }
}
