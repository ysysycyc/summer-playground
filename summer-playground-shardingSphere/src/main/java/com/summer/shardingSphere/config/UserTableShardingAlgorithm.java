package com.summer.shardingSphere.config;

import org.apache.shardingsphere.sharding.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.RangeShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.StandardShardingAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author lijiawei
 */
@Component
public class UserTableShardingAlgorithm implements StandardShardingAlgorithm<Long> {

    @Override
    public String getType() {
        return "SELFTABLE";
    }

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Long> preciseShardingValue) {
        return preciseShardingValue.getLogicTableName() + preciseShardingValue.getValue() % 2;
    }

    @Override
    public Collection<String> doSharding(Collection<String> collection, RangeShardingValue<Long> rangeShardingValue) {
        return null;
    }

    @Override
    public void init() {

    }
}
