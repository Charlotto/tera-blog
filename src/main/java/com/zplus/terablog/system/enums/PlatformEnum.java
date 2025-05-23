package com.zplus.terablog.system.enums;

import com.zplus.terablog.blog.posts.domain.vo.CNBlogsVO;
import com.zplus.terablog.blog.posts.domain.vo.CSDNVO;
import com.zplus.terablog.blog.posts.domain.vo.JianShuVO;
import com.zplus.terablog.blog.posts.domain.vo.JueJinVO;
import com.zplus.terablog.blog.posts.domain.vo.SegmentFaultVO;

import java.util.HashMap;
import java.util.Map;

public enum PlatformEnum {

    /**
     * 掘金
     */
    JUE_JIN(1, JueJinVO.class),

    /**
     * 简书
     */
    JIAN_SHU(2, JianShuVO.class),

    /**
     * CSDN
     */
    CSDN(3, CSDNVO.class),

    /**
     * 思否
     */
    SEGMENT_FAULT(4, SegmentFaultVO.class),

    /**
     * 博客园
     */
    CN_BLOGS(5, CNBlogsVO.class);

    private static final Map<Integer, PlatformEnum> enumTypeMap = new HashMap<>();

    static {
        for (PlatformEnum platformEnum : PlatformEnum.values()) {
            enumTypeMap.put(platformEnum.type, platformEnum);
        }
    }

    private final Integer type;
    private final Class platformClass;

    PlatformEnum(Integer type, Class platformClass) {
        this.type = type;
        this.platformClass = platformClass;
    }

    public Integer getType() {
        return type;
    }

    public Class getPlatformClass() {
        return platformClass;
    }

    public static Map<Integer, PlatformEnum> getEnumTypeMap() {
        return enumTypeMap;
    }
}
