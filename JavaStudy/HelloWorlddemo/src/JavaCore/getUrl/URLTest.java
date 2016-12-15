package getUrl;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import writeReaderDemo.changWrite;
 
public class URLTest {
	/*static String sss="String a1=\"contract_field:contract_code\";String a2=\"closingPrice\";String a3=\"lastTradeTime\";String a4=\"settlementPrice\";String a5=\"volumeTotal\";";*/
 // 一个public方法，返回字符串，错误则返回"error open url"
 public static String getContent(String strUrl) {
  try {
   URL url = new URL(strUrl);
   BufferedReader br = new BufferedReader(new InputStreamReader(url
     .openStream()));
   String s = "";
   StringBuffer sb = new StringBuffer("");
   while ((s = br.readLine()) != null) {
    sb.append(s + "/r/n");
   }
   br.close();
   return sb.toString();
  } catch (Exception e) {
   return "error open url:" + strUrl;
  }
 }
 
 public static void initProxy(String host, int port, final String username,
   final String password) {
  Authenticator.setDefault(new Authenticator() {
   protected PasswordAuthentication getPasswordAuthentication() {
    return new PasswordAuthentication(username,
      new String(password).toCharArray());
   }
  });
  System.setProperty("http.proxyType", "4");
  System.setProperty("http.proxyPort", Integer.toString(port));
  System.setProperty("http.proxyHost", host);
  System.setProperty("http.proxySet", "true");
 }
 
 public static String getsrc(String url) throws IOException {
  /* String url = "http://www.eex.com/data//view/data/detail/emission-eua-spot-v2/2014/04.07.json";*/
/*   String url = "http://www.jb51.net";*/
   String proxy = "http://192.168.22.81";
   int port = 80;
   String username = "username";
   String password = "password";
   String curLine = "";
   String content = "";
   URL server = new URL(url);
   initProxy(proxy, port, username, password);
   HttpURLConnection connection = (HttpURLConnection) server
   .openConnection();
   connection.connect();
   InputStream is = connection.getInputStream();
   BufferedReader reader = new BufferedReader(new
   InputStreamReader(is));
   while ((curLine = reader.readLine()) != null) {
   content = content + curLine+ "/r/n";
   }
 /*  System.out.println("content= " + content);
   System.out.println(getContent(url));*/
   is.close();
   return content+getContent(url);
 }
 
 public static void writeFile(String str1) throws IOException{
	File f=new File("D:" + File.separator + "get.html");
	OutputStream output = new FileOutputStream(f, true);  //append为true，写入不覆盖
	byte[] b = str1.getBytes(); 
	output.write(b);
	output.close();
 }
 
/* String url = "http://www.eex.com/data//view/data/detail/emission-eua-spot-v2/2014/04.07.json";*/
 public static  String[] getword(String url) throws IOException{
	String a1="contract_field:contract_code";
	String a2="closingPrice";
	String a3="lastTradeTime";
	String a4="settlementPrice";
	String a5="volumeTotal";
	String b[] =new String[5];
	String st[]=getsrc(url).split("\"");
	/*String st[]=sss.split("\"");*/
	for(int i=0;i<st.length;i++){
		if(st[i].contains(a1)){
			b[0]=st[i+2];
		}
		if(st[i].contains(a2)){
			b[1]=st[i+1];
		}
		if(st[i].contains(a3)){
			b[2]=st[i+2];
		}
		if(st[i].contains(a4)){
			b[3]=st[i+1];
		}
		if(st[i].contains(a5)){
			b[4]=st[i+1];
		}
	}
	return b;
 }
 
 public static String changword(String b[]){
	 String str="<tr>";
	 for(int i=0;i<b.length;i++){
		 str=str+"<td>"+b[i]+"</td>";
	 }
	 str=str+"</tr>";
	 return str;
 }
 
 public static String[] http(){
	 String http[] =new String[2900] ;
	 String ht="http://www.eex.com/data//view/data/detail/emission-eua-spot-v2/";
	 String json=".json";
	 String str="2016/12.15";
	 Calendar c = Calendar.getInstance();
		c.set(2009,00,18);
		
		for(int i=0;i<=3000;i++){
		c.add(Calendar.DAY_OF_MONTH, 1);
		SimpleDateFormat sm=new SimpleDateFormat("yyyy/MM.dd");
		String date= sm.format(c.getTime());
		http[i]=ht+date+json;
		if(date.equals(str)){
			/*System.out.println(i);*/
			break;
			}
		}
	 return http;
 }
 
 
 public static void main(String args[]) throws IOException{
/*	String url[]= http();
*	writeFile("<html><body><table border=\"1\">");
*	writeFile("<tr><td>Name</td><td>Last Price</td><td>Last Time</td><td>Settl. Price</td><td>Vol.</td></tr>");
	
	for(int i=0;i<4;i++){
	for(int i=0;i<url.length;i++){
		if(getword(url[i])[1]==null){
			continue;
		}
		writeFile(changword(getword(url[i])));
	}
	writeFile("</table></body></html>");*/
	 System.out.println( getword("")[0]);
 }
}
 