package mrk129_lab6;

public class myRectangle {

		int width;
	
		int height;
		
		int startX;
	
		int startY;
	
	public myRectangle()
	
	{
		width = 0;
		
		height = 0;
		
		startX = 0;
		
		startY = 0;
				
	}
	
	
	public myRectangle(int w, int h, int x, int y) {
	
		width = w;
		
		height = h;
		
		startX = x;
		
		startY = y;
	
	}	
	
	public int area() {
		
		return width * height;
	
	}
	
	public String toString() {
		
		StringBuilder S = new StringBuilder();
		
		S.append("Width: " + width);
		S.append(" Height: " + height);
		S.append(" X: " + startX);
		S.append(" Y: " + startY);
		return S.toString();
		

	}
	
	public boolean isInside(int x, int y) {
	
		int x1 = startX;
		int y1 = startY;
		int x2 = x1 + width;
		int y2 = y1 + height;
		
		if (x > x1 && x < x2 && y > y1 && y < y2) {
		
			return true;
			
		}else {
			
			return false;	
					
		}
	}
	
	public void setSize (int w, int h)
	{
		 
		width =  w;
		height = h;
		
	}
	
	public void setPosition (int x, int y)
	{
		startX = x;
		startY = y;
	}
	
}	
