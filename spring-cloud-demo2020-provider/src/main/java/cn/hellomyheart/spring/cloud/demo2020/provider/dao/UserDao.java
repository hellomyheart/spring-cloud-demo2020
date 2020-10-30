package cn.hellomyheart.spring.cloud.demo2020.provider.dao;

import cn.hellomyheart.spring.cloud.demo2020.provider.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description
 * @className: UserDao
 * @package: cn.hellomyheart.spring.cloud.demo2020.provider.dao
 * @author: Stephen Shen
 * @date: 2020/10/30 上午8:27
 */
public interface UserDao extends JpaRepository<User, Integer> {
}
