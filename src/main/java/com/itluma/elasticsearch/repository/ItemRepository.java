package com.itluma.elasticsearch.repository;

import com.itluma.elasticsearch.pojo.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @author 飞鸟
 * @date 2019/8/15 - 17:22
 */
public interface ItemRepository extends ElasticsearchRepository<Item, Long> {
    /**
     * 根据价格区间查询
     * @param price1
     * @param price2
     * @return
     */
    List<Item> findByPriceBetween(double price1, double price2);
}
