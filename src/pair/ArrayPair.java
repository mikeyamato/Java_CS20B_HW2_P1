package pair;

public class ArrayPair<T> implements PairInterface<T> {
  // create array of size 2
  T[] arrPair = (T[]) new Object[2];;

  @Override
  public void pair(T first, T second) {
    this.arrPair[0] = first;
    this.arrPair[1] = second;
  }

  @Override
  public void setFirst(T first) {
    this.arrPair[0] = first;
  }

  @Override
  public void setSecond(T second) {
    this.arrPair[1] = second;
  }

  @Override
  public T getFirst() {
    return arrPair[0];
  }

  @Override
  public T getSecond() {
    return arrPair[1];
  }
}
