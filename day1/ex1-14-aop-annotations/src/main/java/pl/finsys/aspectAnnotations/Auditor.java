package pl.finsys.aspectAnnotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Auditor {

    private List<String> audit = new ArrayList<>();

	@Before("...")
	public void logBefore(JoinPoint joinPoint) {
        audit.add("hacker starts logging in!");
	}

	@After("...")
	public void logAfter(JoinPoint joinPoint) {
        audit.add("hacker is logged in!");
	}
	
	@AfterReturning(pointcut = "...", returning= "result")
	public void logAfterReturning(JoinPoint joinPoint, Object result) {
        audit.add("hacker IP address is " + result);
	}
	
	@AfterThrowing(pointcut = "...", throwing= "error")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
		audit.add("hacker is captured!");
	}
	
	@Around("...")
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		audit.add("hacker is damaging database " + Arrays.toString(joinPoint.getArgs()));
	}

    public List<String> getAudit() {
        return audit;
    }
}