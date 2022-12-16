package com.wowkster.cosmic_fiend.util;

public class Vector2 {
    public static final Vector2 ZERO = new Vector2(0.0f, 0.0f);
    public static final Vector2 DEFAULT_SCALE = new Vector2(1.0f, 1.0f);
    public float x;
    public float y;

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2(double x, double y) {
        this.x = (float)x;
        this.y = (float)y;
    }

    public float magnitude() {
        return (float)Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public Vector2 normalize() {
        float magnitude = this.magnitude();
        if (magnitude > 0.0f) {
            return this.div(magnitude);
        }
        return new Vector2(this.x, this.y);
    }

    public Vector2 direction(Vector2 vector) {
        return vector.sub(this).normalize();
    }

    public Vector2 rotation() {
        Vector2 dir = this.normalize();
        return new Vector2((float)Math.cos(dir.x), (float)Math.sin(dir.y));
    }

    public Vector2 rotationDegrees() {
        Vector2 dir = this.normalize();
        return new Vector2((float)Math.toDegrees(Math.cos(dir.x)), (float)Math.toDegrees(Math.sin(dir.y)));
    }

    public Vector2 interpolate(Vector2 vector, float t) {
        return new Vector2(MathUtils.interpolate(this.x, vector.getX(), t), MathUtils.interpolate(this.y, vector.getY(), t));
    }

    public Vector2 clamp(Vector2 min, Vector2 max) {
        return new Vector2(MathUtils.clamp(this.x, min.x, max.x), MathUtils.clamp(this.y, min.y, max.y));
    }

    public static Vector2 create(float x, float y) {
        return new Vector2(x, y);
    }

    public static Vector2 rad(float x, float y) {
        return new Vector2(MathUtils.rad(x), MathUtils.rad(y));
    }

    public Vector2 add(Vector2 vector) {
        return new Vector2(this.x + vector.getX(), this.y + vector.getY());
    }

    public Vector2 add(Vector2 vector, float delta) {
        Vector2 newVector = new Vector2(this.x + vector.getX(), this.y + vector.getY());
        return this.interpolate(newVector, delta);
    }

    public Vector2 sub(Vector2 vector) {
        return new Vector2(this.x - vector.getX(), this.y - vector.getY());
    }

    public Vector2 mul(Vector2 vector) {
        return new Vector2(this.x * vector.getX(), this.y * vector.getY());
    }

    public Vector2 div(Vector2 vector) {
        return new Vector2(this.x / vector.getX(), this.y / vector.getY());
    }

    public Vector2 add(float x1, float y1, float z1) {
        return new Vector2(this.x * x1, this.y * y1);
    }

    public Vector2 sub(float x1, float y1, float z1) {
        return new Vector2(this.x / x1, this.y / y1);
    }

    public Vector2 mul(float x1, float y1, float z1) {
        return new Vector2(this.x * x1, this.y * y1);
    }

    public Vector2 div(float x1, float y1, float z1) {
        return new Vector2(this.x / x1, this.y / y1);
    }

    public Vector2 add(float t) {
        return new Vector2(this.x + t, this.y + t);
    }

    public Vector2 sub(float t) {
        return new Vector2(this.x - t, this.y - t);
    }

    public Vector2 mul(float t) {
        return new Vector2(this.x * t, this.y * t);
    }

    public Vector2 div(float t) {
        return new Vector2(this.x / t, this.y / t);
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String toString() {
        return "[x=" + this.x + ";y=" + this.y + "]";
    }
}
