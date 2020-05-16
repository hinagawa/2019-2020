package ru.kpfu.itis.aspect.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.aspect.model.Method;
import ru.kpfu.itis.aspect.repository.MethodRepository;

import java.util.Optional;

@Aspect
@Component
@EnableAspectJAutoProxy
public class AspectComponent {
    @Autowired
    MethodRepository methodRepository;

    @Pointcut("@annotation(MyTransaction)")
    public void callMyTransaction() {
    }

    @Around(value = "callMyTransaction()")
    public Object aroundCallMyTransaction(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        Optional<Method> method_by_uuid = methodRepository.findMethodByUuid(args[0].toString());
        Optional<Method> method_by_name = methodRepository.findMethodByName(joinPoint.getSignature().toString());

         if (!method_by_name.isPresent()) {
            if (!method_by_uuid.isPresent()) {
                methodRepository.save(Method.builder()
                        .name(joinPoint.getSignature().toString())
                        .uuid(args[0].toString())
                        .return_value(joinPoint.proceed().toString())
                        .build());
                System.out.println("Method has been added to DB");
                return joinPoint.proceed();
            } else {
                System.out.println("UUID already exists");
                return null;
            }
        } else {
            if (!method_by_uuid.isPresent()) {
                return null;
            } else {
                if (method_by_name.get().getUuid().equals(method_by_uuid.get().getUuid())) {
                    Method method = methodRepository.findMethodByUuid(args[0].toString()).get();
                    System.out.println("Get method from DB");
                    return method.getReturn_value();
                } else {
                    System.out.println("UUID and method don't compare ");
                    return null;
                }
            }
        }
    }
}
