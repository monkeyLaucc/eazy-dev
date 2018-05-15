package cc.lau.eazydev.biz.entity.admin;

import cc.lau.eazydev.biz.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

/**
 * Created by cc on 18/5/14
 */
@Entity
@Data
public class AdminUser extends BaseEntity {
    private String name;
    private String password;
}
