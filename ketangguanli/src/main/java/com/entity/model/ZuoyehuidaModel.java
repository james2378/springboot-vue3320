package com.entity.model;

import com.entity.ZuoyehuidaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 作业回答
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZuoyehuidaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 作业
     */
    private Integer zuoyejiluId;


    /**
     * 学生
     */
    private Integer yonghuId;


    /**
     * 作业文件
     */
    private String zuoyehuidaFile;


    /**
     * 状态
     */
    private Integer zuoyehuidaTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：作业
	 */
    public Integer getZuoyejiluId() {
        return zuoyejiluId;
    }


    /**
	 * 设置：作业
	 */
    public void setZuoyejiluId(Integer zuoyejiluId) {
        this.zuoyejiluId = zuoyejiluId;
    }
    /**
	 * 获取：学生
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：学生
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：作业文件
	 */
    public String getZuoyehuidaFile() {
        return zuoyehuidaFile;
    }


    /**
	 * 设置：作业文件
	 */
    public void setZuoyehuidaFile(String zuoyehuidaFile) {
        this.zuoyehuidaFile = zuoyehuidaFile;
    }
    /**
	 * 获取：状态
	 */
    public Integer getZuoyehuidaTypes() {
        return zuoyehuidaTypes;
    }


    /**
	 * 设置：状态
	 */
    public void setZuoyehuidaTypes(Integer zuoyehuidaTypes) {
        this.zuoyehuidaTypes = zuoyehuidaTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
