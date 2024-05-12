package me.fatezero.common.dao;

import me.fatezero.common.entity.BaseEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseDao<T extends BaseEntity, I extends Serializable> extends JpaRepository<T, I>, JpaSpecificationExecutor<T> {
}
