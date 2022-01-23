import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreCount extends Actor
{
    private Player pc;
    GreenfootImage score;
    public ScoreCount(Player pc)
    {
        this.pc = pc;
        score = new GreenfootImage(144, 50);
        setImage(score);
        Font font = new Font("Agency FB", 30);
        score.setFont(font);
        score.setColor(Color.WHITE);
    }
    public void updateScore()
    {
        score.clear();
        score.drawString(Integer.toString(pc.score), 72, 25);
        setImage(score);
    }
    public void act()
    {
        updateScore();
    }
}
