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

public class CursedStatue extends Entity {
  // Private variables
  private int timer;
  private int delay;

  // Default constructor
  CursedStatue() {
    super();
    timer = 3;
    delay = 3;
    setHp(8);
  }

  // Constructor with the delay
  CursedStatue(int d) {
    super();
    timer = d;
    delay = d;
    setHp(8);
  }

  // Constructor for defined coordinates 
  CursedStatue(int x1,int y1,int d) {
    super(x1,y1);
    timer = d;
    delay = d;
    setHp(8);
  }

  // Fire
  void fire() {
  // ...
  }

  // Update
  void update() {
    timer--;
    if (timer <= 0) {
      fire();
      timer = delay;
    }
    setHp(hp() - 1);
  }
}