package cc.lau.eazydev.biz.service.admin;

import cc.lau.eazydev.biz.entity.admin.AdminUser;
import cc.lau.eazydev.biz.repository.admin.AdminUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


/**
 * Created by cc on 18/5/14
 */
@Service
public class AdminServiceImpl {

    @Autowired
    private AdminUserRepository adminUserRepository;

    public AdminUser save(AdminUser adminUser){
        adminUser.setCreateTime(new Date());
        return adminUserRepository.save(adminUser);
    }

    public AdminUser find(Integer id){
        return adminUserRepository.findOne(id);
    }

}
