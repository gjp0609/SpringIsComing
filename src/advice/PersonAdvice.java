package advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import utils.DateUtils;

import java.util.Date;

/**
 * PersonAdvice
 * Created by gjp06 on 17.5.14.
 */
public class PersonAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Date dateBefore = new Date();
        Object proceed = invocation.proceed();
        Date dateAfter = new Date();
        Long time = dateAfter.getTime() - dateBefore.getTime();
        System.out.println(DateUtils.getDate(dateAfter, "yyyy-MM-dd hh:mm:ss")
                + " 执行了 " + invocation.getThis().getClass().getCanonicalName() + " 类中的 "
                + invocation.getMethod().getName() + " 方法，共耗时 " + time + " 毫秒");
        return proceed;
    }
}
