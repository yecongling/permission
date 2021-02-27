package com.ycl.soft.utils.date;

import java.io.Serializable;

/**
 * 时长格式化器
 * @author wonderland
 */
public class BetweenFormater implements Serializable {

    private static final long serialVersionUID = -6155122470085032696L;

    /** 时长毫秒数 */
    private long betweenMs;
    /** 格式化级别 */
    private Level level;
    /** 格式化级别的最大个数 */
    private final int levelMaxCount;

    /**
     * 构造
     * @param betweenMs 日期间隔
     * @param level 级别，按照天、小时、分、秒、毫秒分为5个等级，根据传入等级，格式化到相应级别
     */
    public BetweenFormater(long betweenMs, Level level) {
        this(betweenMs, level, 0);
    }

    /**
     * 构造
     * @param betweenMs 日期间隔
     * @param level 级别，按照天、小时、分、秒、毫秒分为5个等级，根据传入等级，格式化到相应级别
     * @param levelMaxCount 格式化级别的最大个数，假如级别个数为1，但是级别到秒，那只显示一个级别
     */
    public BetweenFormater(long betweenMs, Level level, int levelMaxCount) {
        this.betweenMs = betweenMs;
        this.level = level;
        this.levelMaxCount = levelMaxCount;
    }


    /**
     * 格式化等级枚举
     *
     * @author Looly
     */
    public enum Level {

        /** 天 */
        DAY("天"),
        /** 小时 */
        HOUR("小时"),
        /** 分钟 */
        MINUTE("分"),
        /** 秒 */
        SECOND("秒"),
        /** 毫秒 */
        MILLSECOND("毫秒");

        /** 级别名称 */
        private final String name;

        /**
         * 构造
         * @param name 级别名称
         */
        Level(String name) {
            this.name = name;
        }

        /**
         * 获取级别名称
         * @return 级别名称
         */
        public String getName() {
            return this.name;
        }
    }

}
