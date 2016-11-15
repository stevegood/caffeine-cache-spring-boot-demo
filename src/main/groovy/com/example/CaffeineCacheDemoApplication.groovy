package com.example

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cache.annotation.Cacheable
import org.springframework.cache.annotation.EnableCaching
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@SpringBootApplication
@Controller
@EnableCaching
class CaffeineCacheDemoApplication {

	@Autowired
	TimeService timeService

	static void main(String[] args) {
		SpringApplication.run CaffeineCacheDemoApplication, args
	}

	@RequestMapping
	def index(Model model) {
		model.addAllAttributes now: timeService.timeNow, cached: timeService.cachedTime
		'index'
	}

}
