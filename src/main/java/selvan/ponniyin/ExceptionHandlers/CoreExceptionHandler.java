package selvan.ponniyin.ExceptionHandlers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class CoreExceptionHandler {


    @ExceptionHandler(NullPointerException.class)
    public String handle(){
        return "Exception is handled!";
    }
}
