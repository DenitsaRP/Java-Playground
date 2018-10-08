package collectionsLibrary;

public class Reader {
	
	private String name;
	private int id;
	private static int readerId = 100;
	
	
	public Reader(String name) {
		this.name = name;
		this.id = readerId++;
	}

	
	public int getId() {
		return id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reader other = (Reader) obj;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Reader [name=" + name + ", id=" + id + "]";
	}


	
	
	


}
