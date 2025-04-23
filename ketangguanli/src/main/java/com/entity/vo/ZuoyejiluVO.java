package com.entity.vo;

import com.entity.ZuoyejiluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 作业发布
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zuoyejilu")
public class ZuoyejiluVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 作业名称
     */

    @TableField(value = "zuoyejilu_name")
    private String zuoyejiluName;


    /**
     * 作业类型
     */

    @TableField(value = "zuoyejilu_types")
    private Integer zuoyejiluTypes;


    /**
     * 作业
     */

    @TableField(value = "zuoyejilu_file")
    private String zuoyejiluFile;


    /**
     * 课程
     */

    @TableField(value = "kecheng_id")
    private Integer kechengId;


    /**
     * 作业详情
     */

    @TableField(value = "zuoyejilu_content")
    private String zuoyejiluContent;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：作业名称
	 */
    public String getZuoyejiluName() {
        return zuoyejiluName;
    }


    /**
	 * 获取：作业名称
	 */

    public void setZuoyejiluName(String zuoyejiluName) {
        this.zuoyejiluName = zuoyejiluName;
    }
    /**
	 * 设置：作业类型
	 */
    public Integer getZuoyejiluTypes() {
        return zuoyejiluTypes;
    }


    /**
	 * 获取：作业类型
	 */

    public void setZuoyejiluTypes(Integer zuoyejiluTypes) {
        this.zuoyejiluTypes = zuoyejiluTypes;
    }
    /**
	 * 设置：作业
	 */
    public String getZuoyejiluFile() {
        return zuoyejiluFile;
    }


    /**
	 * 获取：作业
	 */

    public void setZuoyejiluFile(String zuoyejiluFile) {
        this.zuoyejiluFile = zuoyejiluFile;
    }
    /**
	 * 设置：课程
	 */
    public Integer getKechengId() {
        return kechengId;
    }


    /**
	 * 获取：课程
	 */

    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
    }
    /**
	 * 设置：作业详情
	 */
    public String getZuoyejiluContent() {
        return zuoyejiluContent;
    }


    /**
	 * 获取：作业详情
	 */

    public void setZuoyejiluContent(String zuoyejiluContent) {
        this.zuoyejiluContent = zuoyejiluContent;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
