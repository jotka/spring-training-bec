package pl.finsys.aspect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Auditor {

    private List<String> audit = new ArrayList<>();

	public void logBefore(JoinPoint joinPoint) {
        audit.add("hacker starts logging in!");
	}

	public void logAfter(JoinPoint joinPoint) {
        audit.add("hacker is logged in!");
	}
	
	public void logAfterReturning(JoinPoint joinPoint, Object result) {
        audit.add("hacker IP address is " + result);
	}
	
	public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {
		audit.add("hacker is captured!");
	}
	
	public void logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		audit.add("hacker is damaging database " + Arrays.toString(joinPoint.getArgs()));
	}

    public List<String> getAudit() {
        return audit;
    }
}