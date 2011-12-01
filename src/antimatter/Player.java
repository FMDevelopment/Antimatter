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
    
    public int get
}
