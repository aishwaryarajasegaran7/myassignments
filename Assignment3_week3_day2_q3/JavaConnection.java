package Assignment3_week3_day2_q3;

public class JavaConnection extends MySqlConnection implements DatabaseConnection{
	public void connect() 
	{
		System.out.println("connect");
	}
	public void disconnect() 
	{
		System.out.println("disconnect");
	}
	public void executeUpdate() 
	{
		System.out.println("executeupdate");
	}
	public void executeQuery()
	{
		System.out.println("executequery");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      JavaConnection j= new JavaConnection();
      j.connect();
      j.disconnect();
      j.executeUpdate();
      j.executeQuery();
	}

}
