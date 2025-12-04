
interface Resizable {
	void resizewidth(int width);
	void resizeheight(int height);
}
class Rectangle implements Resizable{
	 private int width;
	 private int height;
	 
	 public Rectangle(int width, int height) {
		 this.width=width;
		 this.height=height;
	 }
	 public void resizewidth(int width) {
		 this.width=width;
		 System.out.println("Resized width to:"+width);
	 }
	 public void resizeheight(int height) {
		 this.height=height;
		 System.out.println("Resized height to:"+height);
	 }
	 public int getwidth() {
		 return width;
	 }
	 public int getheight() {
		 return height;
	 }
	 public void displayInfo() {
		 System.out.println("Rectangle: width="+width+"Height="+height);
	 }

}
public class ResizeDemos {

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(10,5);
		
		System.out.println("Original Rectangle Info:");
		rectangle.displayInfo();
		rectangle.resizewidth(15);
		rectangle.resizeheight(8);;
		System.out.println("\nUpdated Rectangle Info:");
		rectangle.displayInfo();
		
		
	}
 
}
