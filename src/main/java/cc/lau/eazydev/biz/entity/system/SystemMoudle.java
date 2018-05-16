package cc.lau.eazydev.biz.entity.system;

import cc.lau.eazydev.biz.entity.BaseIdEntity;
import lombok.Data;

import javax.persistence.Entity;

/**
 * Created by cc on 18/5/16
 */
@Entity
@Data
public class SystemMoudle extends BaseIdEntity {

    //父级id
    private Integer parentId;

    //模块名
    private String name;

    //图标
    private String icon;

    //模块uri
    private String uri;

    //层级
    private Integer level;

    //排序
    private Integer seq;
}
