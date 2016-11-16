package com.example

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class TimeController {

    @Autowired
    TimeService timeService

    @RequestMapping
    def index(Model model) {
        model.addAllAttributes now: timeService.timeNow, cached: timeService.timeCached
        'index'
    }

}
