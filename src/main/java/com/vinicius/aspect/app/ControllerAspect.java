package com.vinicius.aspect.app;

import com.vinicius.aspect.retorno.Retorno;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

@Component
@Aspect
public class ControllerAspect {

    @Around("this(com.vinicius.aspect.controller.BaseController)")
    public Object encapsularRetorno(ProceedingJoinPoint pjp) throws Exception {
        Retorno retorno = new Retorno();
        try {
            Object retornoMetodo = pjp.proceed();
            if (retornoMetodo instanceof ModelAndView) {
                return retornoMetodo;
            } else {
                retorno.setConteudo(retornoMetodo);
            }
            retorno.setConteudo(retornoMetodo);
        } catch (Throwable throwable) {
            retorno.setErro(throwable);
        }
        return retorno;
    }
}
