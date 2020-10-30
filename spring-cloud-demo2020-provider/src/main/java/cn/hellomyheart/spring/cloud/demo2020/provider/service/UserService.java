package cn.hellomyheart.spring.cloud.demo2020.provider.service;

import cn.hellomyheart.spring.cloud.demo2020.common.vo.ResponseResult;

/**
 * @description
 * @className: UserService
 * @package: cn.hellomyheart.spring.cloud.demo2020.provider.service
 * @author: Stephen Shen
 * @date: 2020/10/30 上午8:32
 */
public interface UserService {

    /**
     * 查询
     * @return
     */
    ResponseResult all();

    /**
     * 批量新增
     * @param count
     * @return
     */
    ResponseResult saveAll(int count);

}
