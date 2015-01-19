package au.id.gibsons.andrew.controller

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation._

/**
 * Created by Andrew Gibson on 5/01/15.
 */

@RestController
class HomeController {

  def logger = LoggerFactory.getLogger(this.getClass)

  @RequestMapping(value=Array("/home"),method=Array(RequestMethod.GET))
  def home = {
    logger.info("Home Controller")
    "Welcome to the Scala Web Template"
  }


}
