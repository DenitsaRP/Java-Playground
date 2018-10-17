package collectionsTree;

import java.util.Comparator;

public class DuskiCmparatorPoDebelina implements Comparator<Board>{

	@Override
	public int compare(Board d1, Board d2) {
		return d1.getThickness() - d2.getThickness();
	}

}
