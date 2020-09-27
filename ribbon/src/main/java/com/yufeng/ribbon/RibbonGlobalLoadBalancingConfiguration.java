package com.yufeng.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.ResponseTimeWeightedRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 配置全局负载均衡策略
 * @Author yangwu
 * CreateTime        202009270940
 */
@Configuration
public class RibbonGlobalLoadBalancingConfiguration {

    /**
     * 随机规则
     */
    @Bean
    public IRule ribbonRule() {
        IRule rule;
        //在服务设置了zone时,ribbon默认Server所在区域的性能和Server的可用性轮询选择Server
        //没有设置zone时,ribbon默认轮询策略
        //轮询策略        RoundRobinRule;
        //随机策略       RandomRule;
        //重试策略        RetryRule
        //响应时间加权策略  ResponseTimeWeightedRule
        //最低并发策略     BestAvailableRule
        //区域权衡策略     ZoneAvoidanceRule
        //可用过滤策略     AvailabilityFilteringRule
        rule =  new RoundRobinRule();
        return rule; //随机访问策略
    }

}
