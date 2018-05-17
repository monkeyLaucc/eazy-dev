package cc.lau.eazydev.biz.controller.user;

import cc.lau.eazydev.biz.entity.user.User;
import cc.lau.eazydev.biz.service.user.UserServiceImpl;
import cc.lau.eazydev.core.review.ApiReview;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * Created by cc on 18/5/17
 */
@RestController
@RequestMapping("user")
@Api(value = "user", description = "用户管理", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @PostMapping("saveUser")
    @ApiOperation(value = "添加用户", httpMethod = "POST")
    public ApiReview saveUser(@RequestBody User user) {
        return ApiReview.success(userServiceImpl.save(user));
    }

    @GetMapping("delete/{id}")
    @ApiOperation(value = "删除用户", httpMethod = "GET")
    public ApiReview deleteUser(@PathVariable("id") Integer id) {
        if (Objects.isNull(id)) {
            return ApiReview.fail();
        }
        userServiceImpl.deleteById(id);
        return ApiReview.success();
    }

    @GetMapping("list")
    @ApiOperation(value = "获取用户列表",httpMethod = "GET")
    public ApiReview listUser(){
        return ApiReview.success(userServiceImpl.list());
    }

    @GetMapping("findById/{id}")
    @ApiOperation(value = "根据id获取用户", httpMethod = "GET")
    public ApiReview findById(@PathVariable("id") Integer id) {
        return ApiReview.success(userServiceImpl.findById(id));
    }

    @GetMapping("findByIdWithMoudles/{id}")
    @ApiOperation(value = "根据id获取用户并带上模块信息", httpMethod = "GET")
    public ApiReview findByIdWithMoudles(@PathVariable("id") Integer id) {
        return ApiReview.success(userServiceImpl.findByIdWithMoudles(id));
    }

}
