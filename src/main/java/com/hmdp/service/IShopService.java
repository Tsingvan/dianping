package com.hmdp.service;

import com.hmdp.model.dto.Result;
import com.hmdp.model.entity.Shop;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-22
 */
public interface IShopService extends IService<Shop> {

    /**
     * 根据id查询商铺数据
     * @param id
     * @return
     */
//    Result queryById(Long id);

//    Result updateShop(Shop shop);

//    void saveShop2Redis(Long id, Long expirSeconds) throws InterruptedException;

    /**
     * 根据id查询商铺数据
     * @param id
     * @return
     */
    Result queryById(Long id);

    /**
     * 更新商铺数据
     * @param shop
     * @return
     */
    Result updateShop(Shop shop);

    /**
     * 分页查询店铺数据
     * @param typeId
     * @param current
     * @param x
     * @param y
     * @return
     */
    Result queryShopByType(Integer typeId, Integer current, Double x, Double y);
}
