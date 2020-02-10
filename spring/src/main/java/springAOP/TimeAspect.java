package springAOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.aspectj.lang.ProceedingJoinPoint;



public class TimeAspect {
	
	public Object timer(ProceedingJoinPoint joinPoint) throws Throwable{
		SimpleDateFormat sdf = new SimpleDateFormat();// ��ʽ��ʱ�� 
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// aΪam/pm�ı��
		Date begin = new Date();
		System.out.println("begin time:" + sdf.format(begin));
		Object object = joinPoint.proceed();
		Date end = new Date();
		System.out.println("end time:" + sdf.format(end));
		return object;
		
	}

}
