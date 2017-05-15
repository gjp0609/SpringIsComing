package advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import utils.DateUtils;

import java.util.Date;

/**
 * Created by gjp06 on 17.5.14.
 */
public class LogAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object proceed = invocation.proceed();
        System.out.print(DateUtils.getDate(new Date(), "yyyy-MM-dd hh:mm:ss") + " 执行了 ");
        System.out.print(invocation.getThis().getClass().getCanonicalName() + " 类中的 ");
        System.out.print(invocation.getMethod().getName() + " 方法，传入的参数为：");
        for (Object o : invocation.getArguments())
            System.out.print(o + " ");
        System.out.println();
        return proceed;
    }
}
