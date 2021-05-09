package snippet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String host="localhost";
		String Port="3306";
  Connection con=DriverManager.getConnection( "jdbc:mysql://"+host+":"+Port+"/Qadbt", "root", "Password@14");
	Statement s=con.createStatement();
	ResultSet rs=s.executeQuery("select * from Employeeinfo where name='ram'");
while(rs.next())
	{
	System.out.println(rs.getString("name"));
	System.out.println(rs.getString("location"));
	System.out.println(rs.getString("age"));
	System.out.println(rs.getString("id"));
	System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir") + "\\``chromedriver.exe");

	WebDriver dr=new ChromeDriver();
	dr.get("https://login.salesforce.com/");
	dr.findElement(By.cssSelector("input[id='username']")).sendKeys(rs.getString("name"));
	dr.findElement(By.cssSelector("input[id='password']")).sendKeys(rs.getString("location"));

	}


	}

}

