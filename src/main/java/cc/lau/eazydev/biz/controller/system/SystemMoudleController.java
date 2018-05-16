package cc.lau.eazydev.biz.controller.system;

import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cc on 18/5/16
 */
@RestController
@RequestMapping("systemMoudle")
@Api(value = "systemMoudle", description = "系统模块管理", produces = MediaType.APPLICATION_JSON_VALUE)
public class SystemMoudleController {

}
