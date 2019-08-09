package com.javarush.task.task34.task3410.model;

import java.awt.*;

public class Wall extends CollisionObject {
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.GRAY);
        graphics.drawRect(this.x, this.y, this.width, this.height);
    }

    public Wall(int x, int y) {
        super(x, y);
    }
}
