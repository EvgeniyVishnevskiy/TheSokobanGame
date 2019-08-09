package com.javarush.task.task34.task3410.model;

import java.awt.*;

public class Home extends GameObject {
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.red);
        graphics.drawOval(this.x, this.y, this.width, this.height);
    }

    public Home(int x, int y) {
        super(x, y);
        width = 2;
        height = 2;
    }
}
