package com.mise.communitycenter.domain.vo;

import lombok.Data;

import java.util.Date;

/**
 * @author whm
 * @date 2023/10/27 16:32
 */
@Data
public class CommunityVO {

    /**
     * 社区id
     */
    private long communityID;

    /**
     * 是否公开
     */
    private boolean isPublic;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 社区名称
     */
    private String name;
}
