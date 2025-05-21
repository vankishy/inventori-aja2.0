package org.netbeans.lib.awtextra;

import java.awt.*;

public class AbsoluteConstraints implements java.io.Serializable {
    private int x, y, width = -1, height = -1;

    public AbsoluteConstraints(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public AbsoluteConstraints(int x, int y, int width, int height) {
        this(x, y);
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

    @Override
    public String toString() {
        return super.toString() + " [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
    }
}
