package week2.day4;

public class JavaConnection extends MysqlConnection implements DatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection ob=new JavaConnection();
		ob.connect();
		ob.disconnect();
		ob.executeUpdate();
		ob.executeQuery();

	}

	@Override
	public void connect() {
		System.out.println("Connection established-- method declared in interface DatabaseConnection");
			}

	@Override
	public void disconnect() {
		System.out.println("Disconnected -- method declared in interface DatabaseConnection");
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execution completed -- method declared in interface DatabaseConnection");
			}

}
