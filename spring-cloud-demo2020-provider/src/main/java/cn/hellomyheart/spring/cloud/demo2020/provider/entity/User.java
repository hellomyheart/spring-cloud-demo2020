package cn.hellomyheart.spring.cloud.demo2020.provider.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @description
 * @className: User
 * @package: cn.hellomyheart.spring.cloud.demo2020.provider.entity
 * @author: Stephen Shen
 * @date: 2020/10/30 上午8:27
 */
@Data
@Entity //标记类 对应有表
@Table(name = "t_user") //标记表信息
@NoArgsConstructor
public class User {
    @Id //标记主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主键的生成策略 自增
    private Integer id;
    private String phone;
    private String nickname;
    private String password;
    private Integer flag;

    public User(String phone, String nickname, String password, Integer flag) {
        this.phone = phone;
        this.nickname = nickname;
        this.password = password;
        this.flag = flag;
    }
}
