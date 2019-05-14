/**
 * The MIT License
 * Copyright (c) 2014 Ilkka Seppälä
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.iluwater.update;
/**
 * Application entry point.
 */

abstract class Entity {
  //Private variables
  private int coordinateX;
  private int coordinateY;
  private int hp;
  private int id;
 
  // Default constructor
  public Entity() {
    coordinateX = 0;
    coordinateY = 0;
  }

  // Constructor for defined coordinates 
  public Entity(int x1, int y1) {
    coordinateX = x1;
    coordinateY = y1;
  }

  // Method for access to the hit points 
  int hp() {
    return hp;
  }
  
  void setHp(int h) {
    hp = h;
  }

  // Methods for access to the coordinates and index
  public int getX() {
    return coordinateX;
  }
  
  public int getY() {
    return coordinateY;
  }

  protected void setX(int x1) {
    coordinateX = x1;
  }

  protected void setY(int y1) {
    coordinateY = y1;
  }

  public int id() {
    return id;
  }

  protected void setId(int i) {
    id = i;
  }

  // Abstarct method for updating certain entities
  abstract void update();
}