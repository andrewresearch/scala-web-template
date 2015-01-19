package au.id.gibsons.andrew.service

import org.jsoup.Jsoup
import org.springframework.stereotype.Component

/**
 * Created by andrew on 5/01/15.
 */
@Component
class Cleaner {

  def removeTags(html: String) = {
    val doc = Jsoup.parse(html)
    doc.body().text()
  }

}
