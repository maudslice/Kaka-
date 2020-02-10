package springAOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
//��������һ������
@Component
//��ʾ����һ��bean,��Spring���й���
public class LoggerAspect {
	@Around(value = "execution(* springAOP.ProductService.*(..))")
	public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("start log:" + joinPoint.getSignature().getName());
		Object object = joinPoint.proceed();
		System.out.println("end log:" + joinPoint.getSignature().getName());
		return object;
	}

}
