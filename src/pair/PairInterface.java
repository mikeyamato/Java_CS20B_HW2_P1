package pair;

public interface PairInterface<T> {
  void pair(T first, T second);
  void setFirst(T first);
  void setSecond(T second);
  T getFirst();
  T getSecond();
}
