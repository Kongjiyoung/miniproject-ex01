package com.many.miniproject1._core.errors;

import com.many.miniproject1._core.errors.exception.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(Exception400.class)
    public String ex400(Exception400 e, HttpServletRequest request){
        request.setAttribute("msg", e.getMessage());
        return "errors/400";
    }
    @ExceptionHandler(Exception401.class)
    public String ex401(Exception401 e, HttpServletRequest request){
        request.setAttribute("msg", e.getMessage());
        return "errors/400";
    }
    @ExceptionHandler(Exception403.class)
    public String ex403(Exception403 e, HttpServletRequest request){
        request.setAttribute("msg", e.getMessage());
        return "errors/400";
    }
    @ExceptionHandler(Exception404.class)
    public String ex404(Exception400 e, HttpServletRequest request){
        request.setAttribute("msg", e.getMessage());
        return "errors/400";
    }

    @ExceptionHandler(Exception500.class)
    public String ex500(Exception500 e, HttpServletRequest request){
        request.setAttribute("msg", e.getMessage());
        return "errors/400";
    }


}
