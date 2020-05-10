package com.moshiur.springbootaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Before("execution(* com.moshiur.springbootaop.service.EmployeeService.*(..))")
    public void logBeforeAllMethods(JoinPoint joinPoint){
        LOGGER.info("***from LoggingAspect.logBeforeAllMethods(): "+joinPoint.getSignature().getName()+" ***");
    }

    @After("execution(* com.moshiur.springbootaop.service.EmployeeService.*(..))")
    public void logAfterAllMethods(JoinPoint joinPoint){
        LOGGER.info("*** from LoggingAspect.AfterAllMethods():"+ joinPoint.getSignature().getName()+ "***");
    }

    @Around("execution(* com.moshiur.springbootaop.service.EmployeeService.*(..))")
    public void logAroundAllMethods(JoinPoint joinPoint){
        LOGGER.info("*** from LoggingAspect.AroundAllMethods():"+ joinPoint.getSignature().getName()+ "***");
    }


}
