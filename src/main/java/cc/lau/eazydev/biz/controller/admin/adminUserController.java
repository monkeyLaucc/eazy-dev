package cc.lau.eazydev.biz.controller.admin;

import cc.lau.eazydev.biz.controller.BaseController;
import cc.lau.eazydev.biz.entity.admin.AdminUser;
import cc.lau.eazydev.biz.service.admin.AdminServiceImpl;
import cc.lau.eazydev.core.review.ApiReview;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by cc on 18/5/14
 */
@RestController
@RequestMapping("admin")
@Api(value = "adminUser", description = "后台管理员管理", produces = MediaType.APPLICATION_JSON_VALUE)
public class adminUserController extends BaseController {

    @Autowired
    private AdminServiceImpl adminServiceImpl;

    @PostMapping("save")
    @ApiOperation(value = "添加管理员", httpMethod = "POST")
    public ApiReview save(@RequestBody AdminUser adminUser) {
        return ApiReview.success(adminServiceImpl.save(adminUser));
    }

    @GetMapping("findById/{id}")
    @ApiOperation(value = "添加管理员", httpMethod = "GET")
    public ApiReview findById(@PathVariable("id") Integer id) {
        return ApiReview.success(adminServiceImpl.findById(id));
    }

    @GetMapping("findByCond")
    @ApiOperation(value = "根据条件获取管理员", httpMethod = "GET")
    public ApiReview findByCond() {
        return ApiReview.success(adminServiceImpl.findByCondition((root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.equal(root.get("id"), 1)));
    }
}
