package cc.lau.eazydev.biz.entity.user;

import cc.lau.eazydev.biz.entity.BaseEntity;
import cc.lau.eazydev.biz.entity.system.SystemMoudle;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.List;

/**
 * Created by cc on 18/5/17
 */
@Entity
@Data
public class User extends BaseEntity {
    private String name;

    private String password;

    //权限模块
    private String authMoudle;

    @Transient
    private List<SystemMoudle> systemMoudleList;
}
