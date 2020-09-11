package com.book.domain.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.book.comman.bean.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @Description TODO
 * @Author marshal
 * @Date 4/9/20 10:15 AM
 */
@Data
@ApiModel("菜单信息")
public class Menu extends BaseModel implements Serializable {
    private static final long serialVersionUID = 6485417236040485874L;
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("URL")
    private String url;
    @ApiModelProperty("图标")
    private String icon;
    @ApiModelProperty("父级菜单ID")
    private Long parentId;
    @ApiModelProperty(value = "子菜单", hidden = true)
    @TableField(exist = false)
    private List<Menu> children;
}
