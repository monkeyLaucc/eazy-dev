package cc.lau.eazydev.biz.service.user;

import cc.lau.eazydev.biz.entity.system.SystemMoudle;
import cc.lau.eazydev.biz.entity.user.User;
import cc.lau.eazydev.biz.service.BaseServiceImpl;
import cc.lau.eazydev.biz.service.system.SystemMoudleServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by cc on 18/5/17
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User,Integer> {

    @Autowired
    private SystemMoudleServiceImpl systemMoudleServiceImpl;

    /**
     * 根据id获取用户信息并带上允许访问的模块信息
     *
     * @param id
     * @return
     */
    public User findByIdWithMoudles(Integer id) {
        User user = super.findById(id);
        if (null != user && StringUtils.isNotBlank(user.getAuthMoudle())) {
            List<SystemMoudle> systemMoudleList = systemMoudleServiceImpl.listByCondition((r, q, b) -> r.get("id").in(Arrays.asList(user.getAuthMoudle().split(","))));
            user.setSystemMoudleList(systemMoudleList);
        }
        return user;
    }
}
