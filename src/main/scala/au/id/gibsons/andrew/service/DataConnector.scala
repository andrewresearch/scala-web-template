package au.id.gibsons.andrew.service

import au.id.gibsons.andrew.data.{WebDoc, WebDocRepo}
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.{PageRequest, Pageable}
import org.springframework.stereotype.Component
//import scala.collection.JavaConversions
import scala.collection.JavaConverters

/**
 * Created by andrew on 5/01/15.
 */
@Component
class DataConnector {

  @Autowired val webDocRepo: WebDocRepo = null
  @Autowired val cleaner: Cleaner = null
  def logger = LoggerFactory.getLogger(this.getClass)

  def saveToDatabase(url: String, text: String) = {
    webDocRepo.save(new WebDoc(null,url,text))
  }

}
