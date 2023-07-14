import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day1 {

@Test(groups={"Smoke"})
public void second() {
	
System.out.println("Its Working");

}
@BeforeSuite
public void mhu() {
	
System.out.println("You are the first beyond limits");
}

@Test
public void yourlowerone() {
	
System.out.println("Go Below now");
}

@Test(dependsOnMethods={"yourlowerone"})
public void help() {
	
	System.out.println("Now you can execute");	
}
	
}