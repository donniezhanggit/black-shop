/**
 * <p>Company: www.black-shop.cn</p>
 *
 * <p>Copyright: Copyright (c) 2018-2050</p>
 * <p>
 * black-shop(黑店) 版权所有,并保留所有权利。
 */

package cn.blackshop.product.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品表实体
 * @author zibin
 */
@Data
@ToString
@TableName("bs_product_detail")
public class ProductDetail {

	/**
	 * 主键id
	 */
	private Long id;

	private Long productId;

	@TableField("product_content")
	private Long productContent;
}
