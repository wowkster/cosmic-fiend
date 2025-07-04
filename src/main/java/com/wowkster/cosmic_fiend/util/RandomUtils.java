package com.wowkster.cosmic_fiend.util;

import java.util.Random;

public class RandomUtils {
    private static Random random = new Random();

    public static boolean doWithChance(float chance) {
        double num = random.nextDouble() * 100.0;
        return num <= (double)chance;
    }

    public static double random() {
        return Math.random();
    }

    public static int randomInt(int border) {
        return random.nextInt(border);
    }

    public static int randomInt(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public static float randomFloat(float min, float max) {
        return min + random.nextFloat() * (max - min);
    }
}
