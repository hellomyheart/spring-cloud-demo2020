package cn.hellomyheart.spring.cloud.demo2020.common.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description
 * @className: ResponseResult
 * @package: cn.hellomyheart.spring.cloud.demo2020.common.vo
 * @author: Stephen Shen
 * @date: 2020/10/29 下午4:23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseResult<T> implements Serializable {
    private static final long serialVersionUID = -3805395042577306186L;
    private int code;
    private Object data;
}
