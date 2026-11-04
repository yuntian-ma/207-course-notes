
/**
 * Exercise (Chapter 2: Classes) — overloading, constructors, and static methods.
 *
 * "Overloading" means having several methods (or constructors) with the same
 * name that differ in their parameters. Complete the bodies below so the three
 * `hash` methods and the two constructors behave as documented, then run
 * MyHashingTest. Edit only this file.
 *
 * Relevant reading: 2.4. Constructors, 2.5. Overloading methods, 2.7. Static
 * methods.
 */
public class MyHashing {

  /** The seed carried by this object; updated by the instance hash methods. */
  private int seed;

  /** A shared constant used by the char-based hash. */
  public static final int MODULO = 42;

  /** Creates a MyHashing whose seed starts at 0. */
  public MyHashing() {
    // The seed defaults to 0.
  }

  /**
   * Creates a MyHashing with the given starting seed.
   *
   * @param seed the initial seed value
   */
  public MyHashing(int seed) {
    this.seed = seed;
  }

  /**
   * Stores value as the new seed and returns the previous seed.
   *
   * @param value the new seed
   * @return the seed value from before this call
   */
  public int hash(int value) {
    int previousSeed = seed;
    seed = value;
    return previousSeed;
  }

  /**
   * Stores value as the new seed and returns the sum modulo MODULO.
   *
   * @param value the new seed, as a character
   * @return (previous seed + value) % MODULO
   */
  public int hash(char value) {
    int result = (seed + value) % MODULO;
    seed = value;
    return result;
  }

  /**
   * Returns the sum of the numeric codes of the characters in value.
   *
   * @param value the string to hash
   * @return the sum of the characters' numeric codes
   */
  public static int hash(String value) {
    int sum = 0;
    for (char c : value.toCharArray()) {
      sum += c;
    }
    return sum;
  }
}
