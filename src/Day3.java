import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day3 {
	
@Test(dataProvider ="getdata")
public void Bigfish(String username, String password)
{
	System.out.println("Vijaysutari");
	System.out.println(username);
	System.out.println(password);
	
	
}
@Test(groups={"Smoke"})
public void MHKfck () {
	System.out.println("Sundeep");
	
}

@AfterSuite
public void last() {
System.out.println("Always last");
}

@DataProvider
public Object[][] getdata() {
	Object[][] data= new Object[3][2];
	
	data[0][0]="firstusername";
	data[0][1]="password";
	
	data[1][0]="Secondusername";
	data[1][1]="password";
	
	data[2][0]="Thirdusernamme";
	data[2][1]="password";		
	
	return data;
}

}
