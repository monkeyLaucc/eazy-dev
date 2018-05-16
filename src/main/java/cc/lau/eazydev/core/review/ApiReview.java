package cc.lau.eazydev.core.review;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by cc on 18/5/14
 */
@Data
public class ApiReview implements Serializable {

    private Integer code;

    private Object data;

    private String msg;

    public ApiReview(Integer code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public static ApiReview success() {
        return new ApiReview(20000, null, "ok");
    }

    public static ApiReview success(Object data) {
        return new ApiReview(20000, data, "ok");
    }

    public static ApiReview fail() {
        return new ApiReview(50000, null, "error");
    }

    public static ApiReview fail(String msg) {
        return new ApiReview(50000, null, msg);
    }


}
