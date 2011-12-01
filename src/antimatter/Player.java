/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package antimatter;

/**
 *
 * @author FMDev|MaD
 */
public class Player {
    
    private String name;
    private double posX;
    private double posY;
    private int life;
    private double jump;
    private int item;
    private int deaths;
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public double getX()
    {
        return this.posX;
    }
    
    public void setX(double x)
    {
        this.posX = x;
    }
    
    public void setX(String x)
    {
        this.posX = Double.parseDouble(x);
    }
    
    public double getY()
    {
        return this.posY;
    }
    
    public void setY(double y)
    {
        this.posY = y;
    }
    
    public void setY(String y)
    {
        this.posY = Double.parseDouble(y);
    }
    
    public int getLife()
    {
        return this.life;
    }
    
    private void setLife(int life)
    {
        this.life = life;
    }
    
    public double getJump()
    {
        return this.jump;
    }
    
    public void setJump(double Jump)
    {
        this.jump = Jump;
    }
    
    public int getItem()
    {
        return this.item;
    }
    
    public void setItem(int item)
    {
        this.item = item;
    }
    
    public int getDeath()
    {
        return this.deaths;
    }
    
    public void setDeath(int death)
    {
        this.deaths = death;
    }
    
    public void addDeath()
    {
        this.deaths ++;
    }
}
