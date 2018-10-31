package dataStructures.collectionsTree;

public class Board implements Comparable<Board>{

		private int height;
		private int width;
		private int thickness;
		
		public Board(int height, int width, int thickness) {
			this.height = height;
			this.width = width;
			this.thickness = thickness;
		}	

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}
		
		
		public int getThickness() {
			return thickness;
		}

		public void setThickness(int thickness) {
			this.thickness = thickness;
		}

		@Override
		public int compareTo(Board ob) {
		/*	if(this.height > ob.height) {
				return 1;
			}
			if(this.height < ob.height) {
				return -1;
			} */
			//this.height - ob.height; - prefer
			if(this.width == ob.width){
				return this.thickness - ob.thickness;
			}
			return this.width - ob.width; 
		}

		@Override
		public String toString() {
			return "Board [height=" + height + ", width=" + width + ", thickness=" + thickness + "]";
		}
		
		
		
		
		
		
}
