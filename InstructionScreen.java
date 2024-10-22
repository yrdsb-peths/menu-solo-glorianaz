import greenfoot.*;
/**
 * Write a description of class InstructionScreen here.
 * 
 * @author Zheng
 * @version October 2024
 */
public class InstructionScreen extends World  
{
        
    private World home;
  
    private Label instructions;
    
    private String[] allText = { "Screen 0", "Screen 1", "Screen 2", "Screen 3" };
    
    // index of current Label
    private int currentIndex = 0;
    private Label instructionLabel = new Label(allText[currentIndex], 50); 

    /*
     * Constructor for objects of class InstructionScreen
     */
    public InstructionScreen(World home)
    {
      // create a new world 
        super(600, 400, 1);
        this.home = home;
        instructions = new Label("Use Buttons to Navigate through instruction screens", 20);
        addObject(instructions, 300, 100);
        
        addObject(instructionLabel, 300, 200);
        // Next button
        addObject(new Button(this::nextScreen), 500, 350);
        
        // Back button
        addObject(new Button(this::prevScreen), 100, 350);  
        
    }
    
    
  
    private void nextScreen() {
        if(currentIndex >= allText.length - 1)
        {
          return;
        }
        currentIndex++;
        instructionLabel.setValue(allText[currentIndex]);
      }
    
      private void prevScreen() {
        // Exit if at the first screen
        if (currentIndex == 0) {
          Greenfoot.setWorld(home);
          return;
        } else {
          currentIndex--;
          instructionLabel.setValue(allText[currentIndex]);
        }
    }
    
    private void backMenu()
    {
      Greenfoot.setWorld(home);
    }
}
