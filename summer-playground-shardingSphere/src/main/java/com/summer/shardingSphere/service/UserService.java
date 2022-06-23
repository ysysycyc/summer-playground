package com.summer.shardingSphere.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.summer.shardingSphere.mapper.UserMapper;
import com.summer.shardingSphere.model.User;
/**
 * @author lijiawei
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> {

}
