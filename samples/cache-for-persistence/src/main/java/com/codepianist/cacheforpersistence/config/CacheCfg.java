package com.codepianist.cacheforpersistence.config;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurer;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Configuration;

import javax.crypto.KeyGenerator;
import java.util.concurrent.TimeUnit;

@Configuration
public class CacheCfg implements CachingConfigurer {

//    @Override
//    public CacheManager cacheManager() {
//        ConcurrentMapCacheManager cacheManager = new ConcurrentMapCacheManager() {
//            @Override
//            protected Cache createConcurrentMapCache(final String name) {
//                return new ConcurrentMapCache(name,
//                        CacheBuilder.newBuilder().expireAfterWrite(30, TimeUnit.MINUTES).maximumSize(100).build().asMap(), false);
//            }
//        };
//
//        return cacheManager;
//    }
//
//    @Override
//    public KeyGenerator keyGenerator() {
//        return new DefaultKeyGenerator();
//    }


}
