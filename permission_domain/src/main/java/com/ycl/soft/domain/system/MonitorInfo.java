package com.ycl.soft.domain.system;

/**
 * 系统监控实体类
 * @author wonderland
 * @date 2020/10/2613:03
 */
public class MonitorInfo {
    /**
     * 操作系统
     */
    private String os;
    /**
     * 程序启动时间
     */
    private String runTime;
    /**
     * java版本
     */
    private String jvmJavaVersion;

    //jvm
    /**
     * jvm内存的初始大小
     */
    private String jvmHeapInit;
    /**
     * jvm最大可用内存量
     */
    private String jvmHeapMax;
    /**
     * jvm已使用的内存量
     */
    private String jvmHeapUsed;
    /**
     * jvm已申请的内存量
     */
    private String jvmHeapCommitted;
    /**
     * jvm内存的初始大小
     */
    private String jvmNonHeapInit;
    /**
     * jvm最大可用内存量
     */
    private String jvmNonHeapMax;
    /**
     * jvm已使用的内存量
     */
    private String jvmNonHeapUsed;
    /**
     * jvm已申请的内存量
     */
    private String jvmNonHeapCommitted;

    //硬件信息
    /**
     * CPU信息
     */
    private String cpuInfo;
    /**
     * CPU使用率
     */
    private String cpuUseRate;
    /**
     * 系统内存总量
     */
    private String ramTotal;
    /**
     * 已使用的系统内存量
     */
    private String ramUsed;
    /**
     * 系统磁盘总量
     */
    private String diskTotal;
    /**
     * 已使用的系统磁盘量
     */
    private String diskUsed;


    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    public String getJvmJavaVersion() {
        return jvmJavaVersion;
    }

    public void setJvmJavaVersion(String jvmJavaVersion) {
        this.jvmJavaVersion = jvmJavaVersion;
    }

    public String getJvmHeapInit() {
        return jvmHeapInit;
    }

    public void setJvmHeapInit(String jvmHeapInit) {
        this.jvmHeapInit = jvmHeapInit;
    }

    public String getJvmHeapMax() {
        return jvmHeapMax;
    }

    public void setJvmHeapMax(String jvmHeapMax) {
        this.jvmHeapMax = jvmHeapMax;
    }

    public String getJvmHeapUsed() {
        return jvmHeapUsed;
    }

    public void setJvmHeapUsed(String jvmHeapUsed) {
        this.jvmHeapUsed = jvmHeapUsed;
    }

    public String getJvmHeapCommitted() {
        return jvmHeapCommitted;
    }

    public void setJvmHeapCommitted(String jvmHeapCommitted) {
        this.jvmHeapCommitted = jvmHeapCommitted;
    }

    public String getJvmNonHeapInit() {
        return jvmNonHeapInit;
    }

    public void setJvmNonHeapInit(String jvmNonHeapInit) {
        this.jvmNonHeapInit = jvmNonHeapInit;
    }

    public String getJvmNonHeapMax() {
        return jvmNonHeapMax;
    }

    public void setJvmNonHeapMax(String jvmNonHeapMax) {
        this.jvmNonHeapMax = jvmNonHeapMax;
    }

    public String getJvmNonHeapUsed() {
        return jvmNonHeapUsed;
    }

    public void setJvmNonHeapUsed(String jvmNonHeapUsed) {
        this.jvmNonHeapUsed = jvmNonHeapUsed;
    }

    public String getJvmNonHeapCommitted() {
        return jvmNonHeapCommitted;
    }

    public void setJvmNonHeapCommitted(String jvmNonHeapCommitted) {
        this.jvmNonHeapCommitted = jvmNonHeapCommitted;
    }

    public String getCpuInfo() {
        return cpuInfo;
    }

    public void setCpuInfo(String cpuInfo) {
        this.cpuInfo = cpuInfo;
    }

    public String getCpuUseRate() {
        return cpuUseRate;
    }

    public void setCpuUseRate(String cpuUseRate) {
        this.cpuUseRate = cpuUseRate;
    }

    public String getRamTotal() {
        return ramTotal;
    }

    public void setRamTotal(String ramTotal) {
        this.ramTotal = ramTotal;
    }

    public String getRamUsed() {
        return ramUsed;
    }

    public void setRamUsed(String ramUsed) {
        this.ramUsed = ramUsed;
    }

    public String getDiskTotal() {
        return diskTotal;
    }

    public void setDiskTotal(String diskTotal) {
        this.diskTotal = diskTotal;
    }

    public String getDiskUsed() {
        return diskUsed;
    }

    public void setDiskUsed(String diskUsed) {
        this.diskUsed = diskUsed;
    }

    @Override
    public String toString() {
        return "MonitorInfo{" +
                "os='" + os + '\'' +
                ", runTime='" + runTime + '\'' +
                ", jvmJavaVersion='" + jvmJavaVersion + '\'' +
                ", jvmHeapInit='" + jvmHeapInit + '\'' +
                ", jvmHeapMax='" + jvmHeapMax + '\'' +
                ", jvmHeapUsed='" + jvmHeapUsed + '\'' +
                ", jvmHeapCommitted='" + jvmHeapCommitted + '\'' +
                ", jvmNonHeapInit='" + jvmNonHeapInit + '\'' +
                ", jvmNonHeapMax='" + jvmNonHeapMax + '\'' +
                ", jvmNonHeapUsed='" + jvmNonHeapUsed + '\'' +
                ", jvmNonHeapCommitted='" + jvmNonHeapCommitted + '\'' +
                ", cpuInfo='" + cpuInfo + '\'' +
                ", cpuUseRate='" + cpuUseRate + '\'' +
                ", ramTotal='" + ramTotal + '\'' +
                ", ramUsed='" + ramUsed + '\'' +
                ", diskTotal='" + diskTotal + '\'' +
                ", diskUsed='" + diskUsed + '\'' +
                '}';
    }
    
}
