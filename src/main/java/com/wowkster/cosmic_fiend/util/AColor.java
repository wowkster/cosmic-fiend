package com.wowkster.cosmic_fiend.util;

public class AColor {
    public static final AColor RED = new AColor(1.0f, 0.0f, 0.0f, 1.0f);
    public static final AColor GREEN = new AColor(0.0f, 1.0f, 0.0f, 1.0f);
    public static final AColor DARK_GREEN = new AColor(0.5f, 0.0f, 0.0f, 0.5f);
    public static final AColor BLUE = new AColor(0.0f, 0.0f, 1.0f, 1.0f);
    public static final AColor DARK_BLUE = new AColor(0.0f, 0.0f, 0.5f, 1.0f);
    public static final AColor YELLOW = new AColor(1.0f, 1.0f, 0.0f, 1.0f);
    public static final AColor GOLD = new AColor(1.0f, 0.823529f, 0.0392156f, 1.0f);
    public static final AColor ORANGE = new AColor(1.0f, 0.5f, 0.0f, 1.0f);
    public static final AColor AQUA = new AColor(0.0f, 1.0f, 1.0f, 1.0f);
    public static final AColor CYAN = new AColor(0.0f, 0.5f, 0.5f, 1.0f);
    public static final AColor PURPLE = new AColor(1.0f, 0.0f, 1.0f, 1.0f);
    public static final AColor PINK = new AColor(1.0f, 0.5f, 1.0f, 1.0f);
    public static final AColor WHITE = new AColor(1.0f, 1.0f, 1.0f, 1.0f);
    public static final AColor BLACK = new AColor(0.0f, 0.0f, 0.0f, 1.0f);
    public float r;
    public float g;
    public float b;
    public float a;

    public AColor(float r, float g, float b, float a) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }

    public int[] toArray() {
        int[] colors = new int[]{(int)(this.r * 255.0f), (int)(this.g * 255.0f), (int)(this.b * 255.0f), (int)(this.a * 255.0f)};
        return colors;
    }

    public static AColor fromArray(int[] array) {
        return AColor.convert(array[0], array[1], array[2], array[3]);
    }

    public static AColor convert(int r, int g, int b, int a) {
        return new AColor((float)r / 255.0f, (float)g / 255.0f, (float)b / 255.0f, (float)a / 255.0f);
    }

    public AColor interpolate(AColor color, float t) {
        return new AColor(MathUtils.interpolate(this.r, color.r, t), MathUtils.interpolate(this.g, color.g, t), MathUtils.interpolate(this.b, color.b, t), MathUtils.interpolate(this.a, color.a, t));
    }
}
