package de.uniwue.ub.tesseract.util;

import java.awt.Rectangle;

public class Box {
  private final int x, y, width, height;

  public Box(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public Rectangle toRectangle() {
    return new Rectangle(x, y, width, height);
  }

  public boolean contains(Point point) {
    final int px = point.getX(), py = point.getY();
    return !(px < x || px > x + width || py < y || py > y + height);
  }

  @Override
  public String toString() {
    return "Box(x = " + x + ", y = " + y + ", width = " + width + ", height = "
        + height + ")";
  }
}
