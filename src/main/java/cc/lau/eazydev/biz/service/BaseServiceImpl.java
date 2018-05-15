package cc.lau.eazydev.biz.service;

import cc.lau.eazydev.biz.entity.BaseEntity;
import cc.lau.eazydev.biz.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.io.Serializable;
import java.util.List;

/**
 * Created by cc on 18/5/15
 * <T, ID extends Serializable, B extends JpaRepository<T, ID>>
 */
public class BaseServiceImpl<T extends BaseEntity, ID extends Serializable> {


    @Autowired
    private BaseRepository<T, ID> baseRepository;

    /**
     * save
     *
     * @param t
     * @return
     */
    public T save(T t) {
        return baseRepository.save(t);
    }

    /**
     * update
     *
     * @param t
     * @return
     */
    public T update(T t) {
        return baseRepository.saveAndFlush(t);
    }

    /**
     * delete
     *
     * @param t
     */
    public void delete(T t) {
        baseRepository.delete(t);
    }

    /**
     * delete by id
     *
     * @param id
     */
    public void deleteById(ID id) {
        baseRepository.delete(id);
    }

    /**
     * 根据id获取实体
     *
     * @param id
     * @return
     */
    public T findById(ID id) {
        return baseRepository.findOne(id);
    }

    /**
     * 列出所有实体
     *
     * @return
     */
    public List<T> list() {
        return baseRepository.findAll();
    }

    /**
     * 列出所有实体且排序
     *
     * @param sort
     * @return
     */
    public List<T> list(Sort sort) {
        return baseRepository.findAll(sort);
    }

    /**
     * 分页获取实体
     *
     * @param pageable
     * @return
     */
    public Page<T> page(Pageable pageable) {
        return baseRepository.findAll(pageable);
    }

    /**
     * 根据id判断实体是否存在
     *
     * @param id
     * @return
     */
    public boolean existsById(ID id) {
        return baseRepository.exists(id);
    }

    /**
     * 统计实体
     *
     * @return
     */
    public int count() {
        return (int) baseRepository.count();
    }



    /**
     * TODO 复杂查询
     * 1.根据条件获取实体
     * 2.根据条件列出实体
     * 3.根据条件列出实体且排序
     * 4.根据条件分页获取实体
     * 5.根据条件统计实体
     */

}
