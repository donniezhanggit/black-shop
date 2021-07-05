/**

 * <p>Company: www.black-shop.cn</p>

 * <p>Copyright: Copyright (c) 2018-2050</p>

 * black-shop(黑店) 版权所有,并保留所有权利。

 */
package cn.blackshop.user.api.dto.o;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * UserOutDTO 用户返回的参数DTO
 * @author zibin
 */
@Data
@ToString
public class UserOutDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2708848879471364900L;


	/**
	 * 用户ID
	 */
	private Long userId;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 邮箱
	 */
	private String email;

	/**
	 * 手机号
	 */
	private String phoneNumber;

	/**
	 * 状态  0：禁用   1：正常
	 */
	private Integer status;


	/**
	 * 角色ID列表
	 */
	private List<Long> roleIdList;

	/**
	 * 创建时间
	 */
	private Date createTime;

}