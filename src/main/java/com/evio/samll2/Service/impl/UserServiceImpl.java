package com.evio.samll2.Service.impl;

import com.evio.samll2.Service.UserService;
import com.evio.samll2.VO.UserVO;
import com.evio.samll2.mapper.UserMapper;
import com.evio.samll2.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    @Transactional
    public UserVO getUserById(String id) {
        User user = userMapper.selectByPrimaryKey(id);
        UserVO userVO=new UserVO();
        userVO.setId(id);
        userVO.setIcon(user.getIcon());
        userVO.setNickname(user.getNickname());
        userVO.setRealname(user.getRealname());
        return userVO;
    }
}
