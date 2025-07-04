package com.wowkster.cosmic_fiend.util;

public class MathUtils {
    public static float interpolate(float a, float b, float t) {
        return (1.0f - t) * a + t * b;
    }

    public static Vector2 interpolate(Vector2 a, Vector2 b, float t) {
        return a.interpolate(b, t);
    }

    public static Vector3 interpolate(Vector3 a, Vector3 b, float t) {
        return a.interpolate(b, t);
    }

    public static AColor interpolate(AColor a, AColor b, float t) {
        return a.interpolate(b, t);
    }

    public static float clamp(float val, float min, float max) {
        return Math.max(min, Math.min(max, val));
    }

    public static Vector2 clamp(Vector2 val, Vector2 min, Vector2 max) {
        return val.clamp(min, max);
    }

    public static Vector3 clamp(Vector3 val, Vector3 min, Vector3 max) {
        return val.clamp(min, max);
    }

    public static Vector2 clamp(Vector2 val, float min, float max) {
        return val.clamp(new Vector2(min, min), new Vector2(max, max));
    }

    public static Vector3 clamp(Vector3 val, float min, float max) {
        return val.clamp(new Vector3(min, min, min), new Vector3(max, max, max));
    }

    public static float clampedInterpolation(float value, float maxValue, float power) {
        return MathUtils.clamp(MathUtils.interpolate(value, value * maxValue, power), -maxValue, maxValue);
    }

    public static boolean equalsApproximately(float a, float b) {
        float tolerance;
        float diff = Math.abs(b - a);
        return diff < (tolerance = 0.001f * b);
    }

    public static boolean equalsApproximately(Vector2 a, Vector2 b) {
        return MathUtils.equalsApproximately(a.x, b.x) && MathUtils.equalsApproximately(a.y, b.y);
    }

    public static boolean equalsApproximately(Vector3 a, Vector3 b) {
        return MathUtils.equalsApproximately(a.x, b.x) && MathUtils.equalsApproximately(a.y, b.y) && MathUtils.equalsApproximately(a.z, b.z);
    }

    public static boolean equalsApproximately(AColor a, AColor b) {
        return MathUtils.equalsApproximately(a.r, b.r) && MathUtils.equalsApproximately(a.g, b.g) && MathUtils.equalsApproximately(a.b, b.b) && MathUtils.equalsApproximately(a.a, b.a);
    }

    public static float rad(float angle) {
        return angle * (float)Math.PI / 180.0f;
    }

    public static float range(float oldMin, float oldMax, float newMin, float newMax, float value) {
        float newValue;
        float oldRange = oldMax - oldMin;
        if (oldRange == 0.0f) {
            newValue = newMin;
        } else {
            float newRange = newMax - newMin;
            newValue = (value - oldMin) * newRange / oldRange + newMin;
        }
        return newValue;
    }
}
