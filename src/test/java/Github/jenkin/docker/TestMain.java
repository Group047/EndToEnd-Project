package Github.jenkin.docker;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import Github.Jekins.Docker.Main;

public class TestMain {
	@Test
	public void testInputIsEven(){
	 assertTrue(Main.checkIfInputIsAnEvenNumber(22));
	}
}
