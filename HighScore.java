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
    public HighScore(World previousScreen)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        this.previousScreen = previousScreen;
        
        // highscore map with 3 names
        highScores = new HashMap<>();
        highScores.put("Mr.Chan", 2900);
        highScores.put("Tiffany", 2800);
        highScores.put("Andrew", 1000);
        
        addScores();
    }
    
    private void addScores(){
        int y = 100;
        
        for (Map.Entry<String, Integer> entry : highScores.entrySet()) 
        {
          String text = entry.getKey() + ": " + entry.getValue();
          Label scoreLabel = new Label(text, 24);
          addObject(scoreLabel, 300, y);
          y+= 50;
        }
    }
}
