package com.guisei.azurlaneuncensored.config;

/**
 * 碧蓝航线所有国内渠道服的包名管理
 * 国外服务器不用反和谐
 */
public enum PackEnum {

    BILIBILI("官服（B服）", "com.bilibili.azurlane"),
    HUAWEI("华为渠道服", "com.bilibili.blhx.huawei"),
    XIAOMI("小米渠道服", "com.bilibili.blhx.mi"),
    TENCENT("应用宝渠道服", "com.tencent.tmgp.bilibili.blhx"),
    BAIDU("百度渠道服", "com.bilibili.blhx.baidu"),
    M360("360渠道服", "com.bilibili.blhx.qihoo"),
    OPPO("OPPO渠道服", "com.bilibili.blhx.nearme.gamecenter"),
    VIVO("VIVO渠道服", "com.bilibili.blhx.vivo"),
    MEIZU("魅族渠道服", "com.bilibili.blhx.mz"),
    DANGLE("当乐渠道服", "com.bilibili.blhx.dl"),
    LENOVO("联想渠道服", "com.bilibili.blhx.lenovo"),
    UC("UC九游渠道服", "com.bilibili.blhx.uc"),
    MUZHIWAN("拇指玩渠道服", "com.bilibili.blhx.mzw"),
    YOUXI15("游戏15渠道服", "com.bilibili.blhx.yx15"),
    M4399("4399渠道服", "com.bilibili.blhx.m4399"),
    BILIBILI_MOVE("迁移渠道服", "com.bilibili.blhx.bilibiliMove"),

    ;// =================================================================================

    /**
     * 渠道名
     */
    private String channel;
    /**
     * 包名
     */
    private String packName;

    PackEnum(String channel, String packName) {
        this.channel = channel;
        this.packName = packName;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getPackName() {
        return packName;
    }

    public void setPackName(String packName) {
        this.packName = packName;
    }
}
