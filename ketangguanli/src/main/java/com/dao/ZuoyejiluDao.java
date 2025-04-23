package com.dao;

import com.entity.ZuoyejiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoyejiluView;

/**
 * 作业发布 Dao 接口
 *
 * @author 
 */
public interface ZuoyejiluDao extends BaseMapper<ZuoyejiluEntity> {

   List<ZuoyejiluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
