
public class Rectangle {
	private int x;
	 private int y;
	 private int width;
	 private int height;
	 // constructs a new Rectangle with the given x,y, width, and height
	 public Rectangle(int newX, int newY, int newWidth, int newHeight){
	  x= newX;
	  y= newY;
	  width= newWidth;
	  height= newHeight;
	 }
	 
	 public int getX(){ 
	  return x;
	 }
	 public int getY(){
	  return y;
	 }
	 public int getWidth(){
	  return width;
	 }
	 public int getHeight(){
	   return height;
	 }
	 // returns a string such as {(5,12), 4x8}
	 public String toString(){
	 return "Area: "+ area();
	 }
	 
	 public int area(){
		 return width*height;
	 }
	 public int changeSize(int newWidth, int newHeight){
		width= newWidth;
		height= newHeight;
		return (width*height);
	 }
}
