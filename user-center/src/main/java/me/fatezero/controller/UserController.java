package me.fatezero.controller;

import me.fatezero.entity.User;
import me.fatezero.entity.query.UserQueryBean;
import me.fatezero.service.UserService;
import me.fatezero.utils.response.ResponseResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.ApiOperation;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * @return user list
     */
    @ApiOperation("Query User Page")
    @GetMapping("list")
    public ResponseResult<Page<User>> list(@RequestParam int pageSize, @RequestParam int pageNumber) {
        return ResponseResult.success(userService.findPage(UserQueryBean.builder().build(), PageRequest.of(pageNumber, pageSize)));
    }

    @ApiOperation("Add/Edit User")
    @PostMapping("save")
    public ResponseResult<User> save(@RequestBody User user) {
        if (user.getId() == null || !userService.exists(user.getId())) {
            user.setCreateTime(LocalDateTime.now());
            user.setUpdateTime(LocalDateTime.now());
            userService.save(user);
        } else {
            user.setUpdateTime(LocalDateTime.now());
            userService.update(user);
        }
        return ResponseResult.success(userService.find(user.getId()));
    }
}
