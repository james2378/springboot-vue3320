package com.entity.view;

import com.entity.ZuoyehuidaEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 作业回答
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zuoyehuida")
public class ZuoyehuidaView extends ZuoyehuidaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 状态的值
		*/
		private String zuoyehuidaValue;



		//级联表 yonghu
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 学生身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 班级
			*/
			private Integer banjiTypes;
				/**
				* 班级的值
				*/
				private String banjiValue;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

		//级联表 zuoyejilu
			/**
			* 作业名称
			*/
			private String zuoyejiluName;
			/**
			* 作业类型
			*/
			private Integer zuoyejiluTypes;
				/**
				* 作业类型的值
				*/
				private String zuoyejiluValue;
			/**
			* 作业
			*/
			private String zuoyejiluFile;
			/**
			* 作业发布 的 教师
			*/
			private Integer zuoyejiluJiaoshiId;
			/**
			* 作业详情
			*/
			private String zuoyejiluContent;

	public ZuoyehuidaView() {

	}

	public ZuoyehuidaView(ZuoyehuidaEntity zuoyehuidaEntity) {
		try {
			BeanUtils.copyProperties(this, zuoyehuidaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 状态的值
			*/
			public String getZuoyehuidaValue() {
				return zuoyehuidaValue;
			}
			/**
			* 设置： 状态的值
			*/
			public void setZuoyehuidaValue(String zuoyehuidaValue) {
				this.zuoyehuidaValue = zuoyehuidaValue;
			}























				//级联表的get和set yonghu

					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 学生身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 班级
					*/
					public Integer getBanjiTypes() {
						return banjiTypes;
					}
					/**
					* 设置： 班级
					*/
					public void setBanjiTypes(Integer banjiTypes) {
						this.banjiTypes = banjiTypes;
					}


						/**
						* 获取： 班级的值
						*/
						public String getBanjiValue() {
							return banjiValue;
						}
						/**
						* 设置： 班级的值
						*/
						public void setBanjiValue(String banjiValue) {
							this.banjiValue = banjiValue;
						}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}





				//级联表的get和set zuoyejilu

					/**
					* 获取： 作业名称
					*/
					public String getZuoyejiluName() {
						return zuoyejiluName;
					}
					/**
					* 设置： 作业名称
					*/
					public void setZuoyejiluName(String zuoyejiluName) {
						this.zuoyejiluName = zuoyejiluName;
					}

					/**
					* 获取： 作业类型
					*/
					public Integer getZuoyejiluTypes() {
						return zuoyejiluTypes;
					}
					/**
					* 设置： 作业类型
					*/
					public void setZuoyejiluTypes(Integer zuoyejiluTypes) {
						this.zuoyejiluTypes = zuoyejiluTypes;
					}


						/**
						* 获取： 作业类型的值
						*/
						public String getZuoyejiluValue() {
							return zuoyejiluValue;
						}
						/**
						* 设置： 作业类型的值
						*/
						public void setZuoyejiluValue(String zuoyejiluValue) {
							this.zuoyejiluValue = zuoyejiluValue;
						}

					/**
					* 获取： 作业
					*/
					public String getZuoyejiluFile() {
						return zuoyejiluFile;
					}
					/**
					* 设置： 作业
					*/
					public void setZuoyejiluFile(String zuoyejiluFile) {
						this.zuoyejiluFile = zuoyejiluFile;
					}

					/**
					* 获取：作业发布 的 教师
					*/
					public Integer getZuoyejiluJiaoshiId() {
						return zuoyejiluJiaoshiId;
					}
					/**
					* 设置：作业发布 的 教师
					*/
					public void setZuoyejiluJiaoshiId(Integer zuoyejiluJiaoshiId) {
						this.zuoyejiluJiaoshiId = zuoyejiluJiaoshiId;
					}


					/**
					* 获取： 作业详情
					*/
					public String getZuoyejiluContent() {
						return zuoyejiluContent;
					}
					/**
					* 设置： 作业详情
					*/
					public void setZuoyejiluContent(String zuoyejiluContent) {
						this.zuoyejiluContent = zuoyejiluContent;
					}




}
