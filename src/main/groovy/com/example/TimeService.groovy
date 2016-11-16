package com.example

import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

/**
 * Created by sgood on 11/15/16.
 */
@Service
class TimeService {

    long getTimeNow() {
        new Date().time
    }

    @Cacheable('timeCached')
    long getTimeCached() {
        timeNow
    }
}
