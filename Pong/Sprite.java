package Pong;
import java.awt.Color;
import java.awt.Rectangle;

public class Sprite {

	private int xPosition, yPosition; 
	private int xVelocity, yVelocity;
	private int Width, Height;
	private int initialXPosition, initialYPosition;
	
	
	 public void setInitialPosition(int initialX, int initialY) {
	       initialXPosition = initialX;
	       initialYPosition = initialY;
	 }
	       
	 public void resetToInitialPosition() {
	      setxPosition(initialXPosition);
	       setyPosition(initialYPosition);
	 }
	
	public int getxPosition() {
		return xPosition;
	}
	
	public void setxPosition(int newxPosition) {
		this.xPosition = newxPosition;
		
	}
	
	public int getyPosition() {
		return yPosition;
	}
	
	public void setyPosition(int newyPosition) {
		this.yPosition = newyPosition;
	}
	
	 public void setXPosition(int newX, int panelWidth) {
	       xPosition = newX;
	       if(xPosition < 0) {
	           xPosition = 0;
	       } else if(xPosition + Width > panelWidth) {
	           xPosition = panelWidth - Width;
	       }
	 }
	 public void setYPosition(int newY, int panelHeight) {
	      yPosition = newY;
	      if(yPosition < 0) {
	          yPosition = 0;
	      } else if(yPosition + Height > panelHeight) {
	          yPosition = panelHeight - Height;
	      }
	 }
	 
	
	public int getxVelocity() {
		return xVelocity;
	}
	
	public void setxVelocity(int newxVelocity) {
		this.xVelocity = newxVelocity;
	}
	
	public int getyVelocity() {
		return yVelocity;
	}
	
	public void setyVelocity(int newyVelocity) {
		this.yVelocity = newyVelocity;
	}
	
	public int getWidth() {
		return Width;
	}
	
	public void setWidth(int newWidth) {
		this.Width = newWidth;
	}
	
	public int getHeight() {
		return Height;
	}
	
	public void setHeight(int newHeight) {
		this.Height = newHeight;
	}
	
	private Color colour;
	
	 public Color getColour() {
         return colour;
     }
 public void setColour(Color colour) {
         this.colour = colour;
     }

 public Rectangle getRectangle() {
     return new Rectangle(getxPosition(), getyPosition(), getWidth(), getHeight());
 }
	
	
	
}
