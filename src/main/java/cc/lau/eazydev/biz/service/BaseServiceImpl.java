package cc.lau.eazydev.biz.service;

import cc.lau.eazydev.biz.entity.BaseIdEntity;
import cc.lau.eazydev.biz.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.io.Serializable;
import java.util.List;

/**
 * Created by cc on 18/5/15
 */
public class BaseServiceImpl<T extends BaseIdEntity, ID extends Serializable> {


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
     * 根据条件获取实体
     *
     * @param specification
     * @return
     */
    public T findByCondition(Specification<T> specification) {
        return baseRepository.findOne(specification);
    }

    /**
     * 根据条件列出实体
     *
     * @param specification
     * @return
     */
    public List<T> listByCondition(Specification<T> specification) {
        return baseRepository.findAll(specification);
    }

    /**
     * 根据条件列出实体且排序
     *
     * @param specification
     * @param sort
     * @return
     */
    public List<T> listByCondition(Specification<T> specification, Sort sort) {
        return baseRepository.findAll(specification, sort);
    }

    /**
     * 根据条件分页获取实体
     *
     * @param specification
     * @param pageable
     * @return
     */
    public Page<T> pageByCondition(Specification<T> specification, Pageable pageable) {
        return baseRepository.findAll(specification, pageable);
    }

    /**
     * 根据条件统计实体
     *
     * @param specification
     * @return
     */
    public int countByCondition(Specification<T> specification) {
        return (int) baseRepository.count(specification);
    }
}
