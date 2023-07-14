import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day2 {
	
@Test
public void Bigfish() {
	
	System.out.println("Yup");
}
@Test
public void MHK() {
	
	System.out.println("Bitch");
}

@BeforeMethod
public void mhu() {
System.out.println("You have to execute before every testcase");
}

@BeforeClass
public void bfc() {
	
	System.out.println("Execute Before Method");
}
}
