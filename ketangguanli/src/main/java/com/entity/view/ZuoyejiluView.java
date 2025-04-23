package com.entity.view;

import com.entity.ZuoyejiluEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 作业发布
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zuoyejilu")
public class ZuoyejiluView extends ZuoyejiluEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 作业类型的值
		*/
		private String zuoyejiluValue;



		//级联表 kecheng
			/**
			* 课程标题
			*/
			private String kechengName;
			/**
			* 课程类型
			*/
			private Integer kechengTypes;
				/**
				* 课程类型的值
				*/
				private String kechengValue;
			/**
			* 课程图片
			*/
			private String kechengPhoto;
			/**
			* 课件下载
			*/
			private String kechengFile;
			/**
			* 班级
			*/
			private Integer banjiTypes;
				/**
				* 班级的值
				*/
				private String banjiValue;
			/**
			* 课程信息 的 教师
			*/
			private Integer kechengJiaoshiId;
			/**
			* 课程详情
			*/
			private String kechengContent;

	public ZuoyejiluView() {

	}

	public ZuoyejiluView(ZuoyejiluEntity zuoyejiluEntity) {
		try {
			BeanUtils.copyProperties(this, zuoyejiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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












				//级联表的get和set kecheng

					/**
					* 获取： 课程标题
					*/
					public String getKechengName() {
						return kechengName;
					}
					/**
					* 设置： 课程标题
					*/
					public void setKechengName(String kechengName) {
						this.kechengName = kechengName;
					}

					/**
					* 获取： 课程类型
					*/
					public Integer getKechengTypes() {
						return kechengTypes;
					}
					/**
					* 设置： 课程类型
					*/
					public void setKechengTypes(Integer kechengTypes) {
						this.kechengTypes = kechengTypes;
					}


						/**
						* 获取： 课程类型的值
						*/
						public String getKechengValue() {
							return kechengValue;
						}
						/**
						* 设置： 课程类型的值
						*/
						public void setKechengValue(String kechengValue) {
							this.kechengValue = kechengValue;
						}

					/**
					* 获取： 课程图片
					*/
					public String getKechengPhoto() {
						return kechengPhoto;
					}
					/**
					* 设置： 课程图片
					*/
					public void setKechengPhoto(String kechengPhoto) {
						this.kechengPhoto = kechengPhoto;
					}

					/**
					* 获取： 课件下载
					*/
					public String getKechengFile() {
						return kechengFile;
					}
					/**
					* 设置： 课件下载
					*/
					public void setKechengFile(String kechengFile) {
						this.kechengFile = kechengFile;
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
					* 获取：课程信息 的 教师
					*/
					public Integer getKechengJiaoshiId() {
						return kechengJiaoshiId;
					}
					/**
					* 设置：课程信息 的 教师
					*/
					public void setKechengJiaoshiId(Integer kechengJiaoshiId) {
						this.kechengJiaoshiId = kechengJiaoshiId;
					}


					/**
					* 获取： 课程详情
					*/
					public String getKechengContent() {
						return kechengContent;
					}
					/**
					* 设置： 课程详情
					*/
					public void setKechengContent(String kechengContent) {
						this.kechengContent = kechengContent;
					}










}
