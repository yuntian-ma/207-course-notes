
import java.util.Objects;

/**
 * Exercise (Chapter 2: Classes) — overriding toString, equals,
 * and hashCode.
 *
 * Every class inherits these methods from Object, but the defaults
 * compare by identity rather than by value.
 *
 * Override the three methods so two points with the same coordinates
 * are treated as equal. Edit only this file.
 */
public class Point {

  private final int x;
  private final int y;

  /**
   * Creates a point.
   *
   * @param x the x-coordinate
   * @param y the y-coordinate
   */
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  /**
   * Returns this point formatted as "(x, y)".
   *
   * @return the string form of this point
   */
  @Override
  public String toString() {
    return "(" + x + ", " + y + ")";
  }

  /**
   * Returns whether o is a Point with the same x and y.
   *
   * @param o the object to compare with
   * @return true iff o is a Point with equal coordinates
   */
  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Point)) {
      return false;
    }

    Point other = (Point) o;
    return this.x == other.x && this.y == other.y;
  }

  /**
   * Returns a hash code consistent with equals.
   *
   * @return a hash code derived from x and y
   */
  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }
}
