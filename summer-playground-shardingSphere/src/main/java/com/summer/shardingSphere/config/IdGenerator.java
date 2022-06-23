package com.summer.shardingSphere.config;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
import com.github.yitter.idgen.YitIdHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author lijiawei
 */
@Component
public class IdGenerator {

    @Bean
    public IdentifierGenerator identifierGenerator() {
        return entity -> YitIdHelper.nextId();
    }

}
