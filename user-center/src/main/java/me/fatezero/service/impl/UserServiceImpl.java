package me.fatezero.service.impl;

import me.fatezero.common.repository.BaseRepository;
import me.fatezero.common.service.impl.BaseServiceImpl;
import me.fatezero.entity.User;
import me.fatezero.entity.query.UserQueryBean;
import me.fatezero.repository.UserRepository;
import me.fatezero.service.UserService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;

import com.github.wenhao.jpa.Specifications;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService {
    /**
     * userRepository.
     */
    private final UserRepository userRepository;

    /**
     * init.
     *
     * @param
     */
    public UserServiceImpl(final UserRepository userRepository2) {
        this.userRepository = userRepository2;
    }

    /**
     * @return base repository
     */
    @Override
    public BaseRepository<User, Long> getBaseRepository() {
        return this.userRepository;
    }

    @Override
    public Page<User> findPage(UserQueryBean queryBean, PageRequest pageRequest) {
        Specification<User> specification = Specifications.<User>and()
                .like(StringUtils.isNotEmpty(queryBean.getUserName()), "username", queryBean.getUserName())
                .build();
        return this.getBaseRepository().findAll(specification, pageRequest);
    }
}
