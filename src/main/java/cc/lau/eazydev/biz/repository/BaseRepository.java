package cc.lau.eazydev.biz.repository;

import cc.lau.eazydev.biz.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * Created by cc on 18/5/15
 */
public interface BaseRepository<T extends BaseEntity, ID extends Serializable> extends JpaRepository<T, ID>,JpaSpecificationExecutor<T> {
}
