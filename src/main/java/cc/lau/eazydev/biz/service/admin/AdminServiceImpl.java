package cc.lau.eazydev.biz.service.admin;

import cc.lau.eazydev.biz.entity.admin.AdminUser;
import cc.lau.eazydev.biz.entity.system.SystemMoudle;
import cc.lau.eazydev.biz.service.BaseServiceImpl;
import cc.lau.eazydev.biz.service.system.SystemMoudleServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;


/**
 * Created by cc on 18/5/14
 */
@Service
public class AdminServiceImpl extends BaseServiceImpl<AdminUser, Integer> {

    @Autowired
    private SystemMoudleServiceImpl systemMoudleServiceImpl;

    /**
     * 根据id获取用户信息并带上允许访问的模块信息
     *
     * @param id
     * @return
     */
    public AdminUser findByIdWithMoudles(Integer id) {
        AdminUser adminUser = super.findById(id);
        if (null != adminUser && StringUtils.isNotBlank(adminUser.getAuthMoudle())) {
            List<SystemMoudle> systemMoudleList = systemMoudleServiceImpl.listByCondition((r, q, b) -> r.get("id").in(Arrays.asList(adminUser.getAuthMoudle().split(","))));
            adminUser.setSystemMoudleList(systemMoudleList);
        }
        return adminUser;
    }
}
