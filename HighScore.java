import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.HashMap;
import java.util.Map;

/**
 * Write a description of class HighScore here.
 * 
 * @author Gloriana Zheng
 * @version October 2024
 */
public class HighScore extends World
{

    private Map<String, Integer> highScores;
    private World previousScreen;
    /**
     * Constructor for objects of class HighScore.
     * 
     */
    public HighScore()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
}
