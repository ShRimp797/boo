package Day09past;

public class cloth extends Product{
	
	
	     String color;
	     String size;
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
			this.size = size;
		}
		@Override
		public String toString() {
			return "cloth [color=" + color + ", size=" + size + "]";
		}
	     
	     

}
