package cc.lau.eazydev.biz.service.admin;

import cc.lau.eazydev.biz.entity.admin.AdminUser;
import cc.lau.eazydev.biz.service.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Date;


/**
 * Created by cc on 18/5/14
 */
@Service
public class AdminServiceImpl extends BaseServiceImpl<AdminUser, Integer> {

    public AdminUser save(AdminUser adminUser) {
        adminUser.setCreateTime(new Date());
        return super.save(adminUser);
    }

}
