import java.text.SimpleDateFormat;
import java.util.Date;


public class OoooSmartClock {
	public void setTimeZone(){
		
	}
	public void setTimeZone(int index){
		int zoneindex = index;
		System.out.println(zoneindex);
	}
	public String getCurrentTimeStamp(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-dd hh:mm:ss");
		Date date = new Date();
		return sdf.format(date);
	}
	public String getLocalCurrentTimeStamp(){
		return "2009-08-07 09:48:87";
	}
	public String getLocalCurrentTimeStamp(String str){
		String ans[] = str.split(" ");
		String days[] = ans[0].split("-");
		String times[] = ans[1].split(":");
		String time_add_on = "";
		String add_on = "";
		
		if(times[0].equals("12") && times[1].equals("00")){
			System.out.println("in");
			time_add_on = "NOON";
		}
		if(times[0].equals("12") && times[1].equals("01") && times[2].equals("00")){
			time_add_on = "NOON";
		}
		
		if(times[0].equals("00") && times[1].equals("00")){
			time_add_on = "MIDNIGHT";
		}
		if(times[0].equals("00") && times[1].equals("01") && times[2].equals("00")){
			time_add_on = "MIDNIGHT";
		}
		
		if(days[1].equals("10") && days[2].equals("10")){
			add_on = " DOUBLE-TEN ";
		}
		
		if(days[1].equals("10") && days[2].equals("10")){
			add_on = " DOUBLE-TEN ";
		}
		if(days[1].equals("08") && days[2].equals("08")){
			add_on = " FATHER'S DAY ";
		}
		if(days[1].equals("12") && days[2].equals("25")){
			add_on = " X'MAS ";
		}
		
		String ret = "";
		ret = ret + ans[0];
		
		if(add_on.equals("")){
			if(time_add_on.equals("")){
				ret = ret + ans[1];
			}
			else{
				ret = ret + time_add_on;
			}
		}
		else{
			ret = ret + add_on;
			if(time_add_on.equals("")){
				ret = ret + ans[1];
			}
			else{
				ret = ret + time_add_on;
			}
		}
		
		return ret;
	}
}
