package me.fatezero.service;

import me.fatezero.common.service.BaseService;
import me.fatezero.entity.User;

import me.fatezero.entity.query.UserQueryBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface UserService extends BaseService<User, Long> {
    /**
     * find by page.
     *
     * @param userQueryBean query
     * @param pageRequest   pageRequest
     * @return page
     */
    Page<User> findPage(UserQueryBean userQueryBean, PageRequest pageRequest);
}
