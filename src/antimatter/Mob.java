/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package antimatter;

/**
 *
 * @author Max
 */
public class Mob {
    
    private int mobID;
    private double hitboxX;
    private double hitboxY;
    private String sprite;
    private int damage;
    private double posX;
    private double posY;
    
    public int getID()
    {
        return this.mobID;
    }
    
    public double getBoxX()
    {
        return this.hitboxX;
    }
    
    public double getBoxY()
    {
        return this.hitboxY;
    }
    
    public String getSprite()
    {
      return this.sprite;  
    }
    
    public double getPosX()
    {
        return this.posX;
    }
    
    public double getPosY()
    {
        return this.posY;
    }
    
    public int getDamage()
    {
        return this.damage;
    }
    
    public void setID(int id)
    {
        this.mobID = id;
    }
    
    public void setID(String id)
    {
        this.mobID = Integer.parseInt(id);
    }
    
    public void setBoxX(double x)
    {
        this.hitboxX = x;
    }
    
    public void setBoxX(String x)
    {
        this.hitboxX = Double.parseDouble(x);
    }
    
    public void setBoxY(double y)
    {
        this.hitboxY = y;
    }
    
    public void setBoxY(String y)
    {
        this.hitboxY = Double.parseDouble(y);
    }
    
    public void setSprite(String sprite)
    {
        this.sprite = sprite;
    }
    
    public void setPosX(double x)
    {
        this.posX = x;
    }
    
    public void setPosX(String x)
    {
        this.posX = Double.parseDouble(x);
    }
    
    public void setPosY(double y)
    {
        this.posY = y;
    }
    
    public void setPosY(String y)
    {
        this.posY = Double.parseDouble(y);
    }
    
    public void setDmg(int damage)
    {
        this.damage = damage;
    }
    
    public void setDmg(String damage)
    {
        this.damage = Integer.parseInt(damage);
    }
}
