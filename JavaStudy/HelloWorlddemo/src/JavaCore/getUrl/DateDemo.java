package getUrl;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2009,00,16);
		String str="2016/12.14";
		
		for(int i=0;i<=50000;i++){
		c.add(Calendar.DAY_OF_MONTH, 1);
		SimpleDateFormat sm=new SimpleDateFormat("yyyy/MM.dd");
		String date= sm.format(c.getTime());
		if(date.equals(str)){
		System.out.println(i);
		break;
		}
	}
	}

}
