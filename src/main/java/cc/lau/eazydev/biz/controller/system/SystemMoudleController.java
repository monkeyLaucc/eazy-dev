package cc.lau.eazydev.biz.controller.system;

import cc.lau.eazydev.biz.entity.system.SystemMoudle;
import cc.lau.eazydev.biz.service.system.SystemMoudleServiceImpl;
import cc.lau.eazydev.core.review.ApiReview;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

/**
 * Created by cc on 18/5/16
 */
@RestController
@RequestMapping("systemMoudle")
@Api(value = "systemMoudle", description = "系统模块管理", produces = MediaType.APPLICATION_JSON_VALUE)
public class SystemMoudleController {

    @Autowired
    private SystemMoudleServiceImpl systemMoudleServiceImpl;

    @PostMapping("save")
    @ApiOperation(value = "添加系统模块", httpMethod = "POST")
    public ApiReview saveSystemMoudle(@RequestBody SystemMoudle systemMoudle) {
        return ApiReview.success(systemMoudleServiceImpl.save(systemMoudle));
    }

    @GetMapping("delete/{id}")
    @ApiOperation(value = "删除系统模块", httpMethod = "GET")
    public ApiReview deleteSystemMoudle(@PathVariable("id") Integer id) {
        if (Objects.isNull(id)) {
            return ApiReview.fail();
        }
        systemMoudleServiceImpl.deleteById(id);
        return ApiReview.success();
    }

    @GetMapping("list")
    @ApiOperation(value = "获取模块列表",httpMethod = "GET")
    public ApiReview listSystemMoudle(){
        return ApiReview.success(systemMoudleServiceImpl.list());
    }

    @GetMapping("findById/{id}")
    @ApiOperation(value = "根据id获取用户", httpMethod = "GET")
    public ApiReview findById(@PathVariable("id") Integer id) {
        return ApiReview.success(systemMoudleServiceImpl.findById(id));
    }
}
