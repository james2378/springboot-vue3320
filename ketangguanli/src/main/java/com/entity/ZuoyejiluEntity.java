package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 作业发布
 *
 * @author 
 * @email
 */
@TableName("zuoyejilu")
public class ZuoyejiluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZuoyejiluEntity() {

	}

	public ZuoyejiluEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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

    @Override
    public String toString() {
        return "Zuoyejilu{" +
            "id=" + id +
            ", zuoyejiluName=" + zuoyejiluName +
            ", zuoyejiluTypes=" + zuoyejiluTypes +
            ", zuoyejiluFile=" + zuoyejiluFile +
            ", kechengId=" + kechengId +
            ", zuoyejiluContent=" + zuoyejiluContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
