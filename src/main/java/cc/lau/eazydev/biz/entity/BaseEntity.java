package cc.lau.eazydev.biz.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Created by cc on 18/5/14
 */
@MappedSuperclass
@Data
public abstract class BaseEntity extends BaseIdEntity {

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    protected Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    protected Date updateTime;

}
