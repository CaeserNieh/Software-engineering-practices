import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class loganalyzertest {
	stubExtensionManager fake = meth(false);
	
	
	loganalyzer log = new loganalyzer(fake);
	
	
	@Test
	public void unittesting(){
		boolean result = log.IsValidLogFileName("short.txt");
		assertFalse("no,thank",result);
	}
	
	public stubExtensionManager meth(boolean testing){
		stubExtensionManager faketesting = new stubExtensionManager();
		faketesting.valid = testing;
		return faketesting;
	}
	
}
class stubExtensionManager implements IExtensionManager{

	public boolean valid;
	@Override
	public boolean IsValid(String filename) {
		// TODO Auto-generated method stub
		return valid;
	}
	
}


