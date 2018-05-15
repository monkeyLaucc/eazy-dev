package cc.lau.eazydev.core.exception;

import cc.lau.eazydev.core.review.ApiReview;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * Created by cc on 18/5/14
 * 统一异常处理
 */
@RestControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiReview serverError(Exception e) {
        e.printStackTrace();
        return ApiReview.fail(e.getMessage());
    }
}
