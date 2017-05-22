package hello;

import java.io.IOException;
/*
 * Servlet 클래스 구현
	1. public class로 선언.
	2. javax.servlet.http.HttpServlet(Java EE API)를 상속(extends) 
	3. 매개변수 없는 생성자(no-argument) => default 생성자 사용(생성자 따로 코드작성안해주면 자동으로 default 생성자가 생성된다.)
	4. doGet() 또는 doPost()메소드를 오버라이딩. => 서블릿이 서비스할 내용을 구현한다.
		doGet() -> Get방식 요청을 처리. doPost() -> Post방식 요청을 처리
	5. 구현한 Servlet class를 톰캣에 등록 
		=> 1. web.xml
		=> 2. Annotation을 이용해 등록(서블릿 3.0부터 -톰캣 7)
*/
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{
	 Date date = new Date();// 실행시점의 일시	
		String current = String.format("%tY-%<tm-%<td%<tH:%<tM:%<tS", date);//2017-04-27 17:30:22
		
		/*//SimpleDateFormat : java.util.Date --> String(format())<<Date를 문자열로  
				(jdk 1.5 부터 추가)				  String --> Date(parse()) << 문자열을 Date로*/		
		//yyyy : 년도(4), MM : 월(2), dd : 일(2), HH : 시간(24시간제[2]), mm : 분(2), ss : 초(2)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String current2 =  sdf.format(date);
		//Date dd = sdf.parse("2011-11-20 23:22:05");
		
		response.setContentType("text/html;charset=UTF-8");//띄어쓰기를 하면 안된다!!
		PrintWriter out = response.getWriter();
		out.println("<!docType html>");
		out.println("<html>");
		out.println("<head><title>현재 시간</title></head>");
		out.println("<body>");
		out.printf("현재 시간1 : %s<br>",current);
		out.printf("현재 시간2 : %s<br>",current2);
		out.println("</body></html>");
		
		
		
		
	}
	
}
