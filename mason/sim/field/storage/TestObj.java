package sim.field.storage;

public class TestObj implements java.io.Serializable {
	int id;

	public TestObj(int id) {
		this.id = id;
	}

	public String toString() {
		return String.format("%d", id);
	}
}