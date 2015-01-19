package au.id.gibsons.andrew.data

import org.springframework.data.mongodb.repository.{Query, MongoRepository}
import org.springframework.data.repository.PagingAndSortingRepository

/**
 * Created by andrew on 5/01/15.
 */

trait WebDocRepo extends PagingAndSortingRepository[WebDoc,String]{
  @Query("{ 'url' : { $regex: ?0 }}")
  def findByUrlRegex(url: String): scala.collection.mutable.ArrayBuffer[WebDoc]
}
