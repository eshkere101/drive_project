package ru.samsung.gamestudio;

public class GameSettings {

    // Device settings

    public static final int SCREEN_WIDTH = 720;
    public static final int SCREEN_HEIGHT = 1280;

    // Physics settings

    public static final float STEP_TIME = 1f / 60f;
    public static final int VELOCITY_ITERATIONS = 6;
    public static final int POSITION_ITERATIONS = 6;
    public static final float SCALE = 0.05f;

    public static float CAR_FORCE_RATIO = 10;
    public static float RED_CAR_VELOCITY = 20;
    public static long STARTING_RED_CAR_APPEARANCE_COOL_DOWN = 2000; // in [ms] - milliseconds


    public static final short RED_CAR_BIT = 2;
    public static final short CAR_BIT = 4;


    // Object sizes

    public static final int SHIP_WIDTH = 150;
    public static final int SHIP_HEIGHT = 250;
    public static final int TRASH_WIDTH = 150;
    public static final int TRASH_HEIGHT = 250;




}
