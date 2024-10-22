import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuScreen here.
 * 
 * @author Gloriana Zheng
 * @version Oct 2024
 */
public class MenuScreen extends World
{
    Label avatarLabel;
    Label highScoreButtonLabel;
    Label instructionLabel;
    public MenuScreen() 
    {
        super(600, 400, 1);

        instructionLabel = new Label("View Instructions", 18);
        addObject(instructionLabel, 300, 310);
        addObject(new Button(() -> Greenfoot.setWorld(new InstructionScreen(this))), 300, 345);
        
        AvatarManager avatarManager = new AvatarManager();
        addObject(avatarManager,300, 100); 
        avatarLabel = new Label("Choose your character!", 18);
        addObject(avatarLabel, 300, 163);
        
        addObject(new Button(() -> goHighScores()), 300, 275);
        highScoreButtonLabel = new Label("View High Scores", 18);
        addObject(highScoreButtonLabel, 300, 240);

    }
    
    public void goHighScores()
    {
        Greenfoot.setWorld(new HighScore(this));
    }
   
}


