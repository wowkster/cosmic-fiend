package com.wowkster.cosmic_fiend.util;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3f;

public class Vector3 {
    public static final Vector3 ZERO = new Vector3(0.0f, 0.0f, 0.0f);
    public static final Vector3 DEFAULT_SCALE = new Vector3(1.0f, 1.0f, 1.0f);
    public float x;
    public float y;
    public float z;

    public Vector3(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3(double x, double y, double z) {
        this.x = (float)x;
        this.y = (float)y;
        this.z = (float)z;
    }

    public Vector3 clamp(Vector3 min, Vector3 max) {
        return new Vector3(MathUtils.clamp(this.x, min.x, max.x), MathUtils.clamp(this.y, min.y, max.y), MathUtils.clamp(this.z, min.z, max.z));
    }

    public Vector3 interpolate(Vector3 vector, float t) {
        return new Vector3(MathUtils.interpolate(this.x, vector.getX(), t), MathUtils.interpolate(this.y, vector.getY(), t), MathUtils.interpolate(this.z, vector.getZ(), t));
    }

    public static Vector3 from(float x, float y, float z) {
        return new Vector3(x, y, z);
    }

    public static Vector3 from(Vector3d vector) {
        return Vector3.from((float)vector.x, (float)vector.y, (float)vector.z);
    }

    public static Vector3 from(Vector3f vector) {
        return Vector3.from(vector.getX(), vector.getY(), vector.getZ());
    }

    public static Vector3 rad(float x, float y, float z) {
        return new Vector3(MathUtils.rad(x), MathUtils.rad(y), MathUtils.rad(z));
    }

    public Vector3 add(Vector3 vector) {
        return new Vector3(this.x + vector.getX(), this.y + vector.getY(), this.z + vector.getZ());
    }

    public Vector3 rotateYaw(float yaw) {
        float angle = (float)Math.toRadians(yaw);
        double rotatedX = (double)this.getX() * Math.cos(angle) - (double)this.getZ() * Math.sin(angle);
        double rotatedZ = (double)this.getZ() * Math.cos(angle) + (double)this.getX() * Math.sin(angle);
        return new Vector3(rotatedX, (double)this.getY(), rotatedZ);
    }

    public Vector3 add(Vector3 vector, float delta) {
        Vector3 newVector = new Vector3(this.x + vector.getX(), this.y + vector.getY(), this.z + vector.getZ());
        return this.interpolate(newVector, delta);
    }

    public float magnitude() {
        return (float)Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public float lengthSquared() {
        return this.x * this.x + this.y * this.y + this.z * this.z;
    }

    public Vector3 normalize() {
        float magnitude = this.magnitude();
        if (magnitude > 0.0f) {
            return this.div(magnitude);
        }
        return new Vector3(this.x, this.y, this.z);
    }

    public Vector3 direction(Vector3 vector) {
        return vector.sub(this).normalize();
    }

    public Vector3 rotation() {
        Vector3 dir = this.normalize();
        return new Vector3((float)Math.cos(dir.x), (float)Math.sin(dir.y), (float)Math.sin(dir.z));
    }

    public Vector3 rotationDegrees() {
        Vector3 dir = this.normalize();
        return new Vector3((float)Math.toDegrees(Math.cos(dir.x)), (float)Math.toDegrees(Math.sin(dir.y)), (float)Math.toDegrees(Math.sin(dir.z)));
    }

    public Vector2 yawPitch() {
        Vector3 dir = this.normalize();
        return new Vector2((float)Math.atan2(dir.x, dir.z), (float)Math.asin(dir.y));
    }

    public Vector2 yawPitchDegrees() {
        Vector3 dir = this.normalize();
        return new Vector2((float)Math.toDegrees(Math.atan2(dir.x, dir.z)), (float)Math.toDegrees(Math.asin(dir.y)));
    }

    public float distanceTo(Vector3 vector) {
        float resX = (this.x - vector.x) * (this.x - vector.x);
        float resY = (this.y - vector.y) * (this.y - vector.y);
        float resZ = (this.z - vector.z) * (this.z - vector.z);
        return MathHelper.sqrt((float)(resX + resY + resZ));
    }

    public Vector3 sub(Vector3 vector) {
        return new Vector3(this.x - vector.getX(), this.y - vector.getY(), this.z - vector.getZ());
    }

    public Vector3 mul(Vector3 vector) {
        return new Vector3(this.x * vector.getX(), this.y * vector.getY(), this.z * vector.getZ());
    }

    public Vector3 div(Vector3 vector) {
        return new Vector3(this.x / vector.getX(), this.y / vector.getY(), this.z / vector.getZ());
    }

    public Vector3 add(float x1, float y1, float z1) {
        return new Vector3(this.x * x1, this.y * y1, this.z * z1);
    }

    public Vector3 sub(float x1, float y1, float z1) {
        return new Vector3(this.x / x1, this.y / y1, this.z / z1);
    }

    public Vector3 mul(float x1, float y1, float z1) {
        return new Vector3(this.x * x1, this.y * y1, this.z * z1);
    }

    public Vector3 div(float x1, float y1, float z1) {
        return new Vector3(this.x / x1, this.y / y1, this.z / z1);
    }

    public Vector3 add(float t) {
        return new Vector3(this.x + t, this.y + t, this.z + t);
    }

    public Vector3 sub(float t) {
        return new Vector3(this.x - t, this.y - t, this.z - t);
    }

    public Vector3 mul(float t) {
        return new Vector3(this.x * t, this.y * t, this.z * t);
    }

    public Vector3 div(float t) {
        return new Vector3(this.x / t, this.y / t, this.z / t);
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float getZ() {
        return this.z;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Vector3d toVector3d() {
        return new Vector3d((double)this.x, (double)this.y, (double)this.z);
    }

    public Vector3f toVector3f() {
        return new Vector3f(this.x, this.y, this.z);
    }

    public String toString() {
        return "[x=" + this.x + ";y=" + this.y + ";z=" + this.z + "]";
    }
}
