import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class OoooSmartClock_testing {

	OoooSmartClock oo ;
	private ByteArrayOutputStream output_console;
	
	
	private void console(){
		output_console = new ByteArrayOutputStream();
		System.setOut(new PrintStream(output_console));
	}
	
	
	
	@Before
	public void setUp(){
		oo = new OoooSmartClock();	
		console();
	}
	
	@Test
	public void setTimezone_testing(){
		oo.setTimeZone(23);
		String ans = "23\n";
		assertEquals(ans,output_console.toString());
	}
	
	@Test
	public void getCurrentTimeStamp_testing(){
		String cur = oo.getCurrentTimeStamp();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");
		Date date = new Date();
		String ans = sdf.format(date);
		
		assertEquals(cur,ans);
	}
	
	@Test
	public void getLocalCurrentTimeStamp_testing(){
		String cur = "";
		cur = oo.getLocalCurrentTimeStamp("2009-12-25 00:00:00");
		assertEquals(cur,"2009-12-25 X'MAS MIDNIGHT");
		
		cur = oo.getLocalCurrentTimeStamp("2009-08-08 12:01:00");
		assertEquals(cur,"2009-08-08 FATHER'S DAY NOON");

		cur = oo.getLocalCurrentTimeStamp("2009-10-10 00:01:01");
		assertEquals(cur,"2009-10-10 DOUBLE-TEN 00:01:01");
		
	}
	
	
}
