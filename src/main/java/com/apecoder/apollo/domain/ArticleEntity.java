package com.apecoder.apollo.domain;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ArticleEntity extends BaseEntity {
    //文章id
//    @TableId(value="id",type= IdType.AUTO)
//    private Integer id;

    @NotNull(message = "文章发布者id必填")
    private Long contributorId;

    //描述
    private String des;

    //封面图
    private String coverImage;

    @NotNull(message = "文章标题必传")
    private String title;
    @NotNull(message = "文章连接必传")
    private String link;

    private String tag;//文章标签
    /**
     * 文章分类（Android、iOS、Java等）0安卓，1 ios,2 java,3 PHP
     */
    @NotNull(message="分类不能为空！")
    private Integer category;
    //文章二级分类(开源库0、资讯1、资料2等)
    private Integer sencondCategory;
    //审核状态(审核中0、通过1、未通过2)
    private Integer auditSatus;

//    @TableField(exist = false)
//    private UserBean userBean;
}
