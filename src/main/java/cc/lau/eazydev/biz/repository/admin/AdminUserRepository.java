package cc.lau.eazydev.biz.repository.admin;

import cc.lau.eazydev.biz.entity.admin.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by cc on 18/5/14
 */
public interface AdminUserRepository extends JpaRepository<AdminUser,Integer> {
}
