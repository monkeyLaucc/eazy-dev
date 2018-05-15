package cc.lau.eazydev.biz.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Created by cc on 18/5/15
 */
@MappedSuperclass
@Data
public abstract class BaseIdEntity implements Serializable {
    @Id
    @GeneratedValue
    protected Integer id;
}
