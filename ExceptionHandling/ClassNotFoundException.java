public class ClassNotFoundException {

	public static void main(String[] args) {
	try {
	Class.forName("org.postgresSql.Driver");

	} catch(Exception ex) {
		ex.printStackTrace();
	}

	}
}
