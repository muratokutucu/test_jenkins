// java -ea AdditionTest
public class AdditionTest {

	public static boolean AddTest(){
		assert Addition.Add(1, 1) == 2 : "Should be equal to 2"; // la condition doit être ce qui doit être correct
		return true;
	}

	public static void main(String[] args){
		if (AddTest()) {
			System.out.println("TEST PASSED");
		}

	}

}
