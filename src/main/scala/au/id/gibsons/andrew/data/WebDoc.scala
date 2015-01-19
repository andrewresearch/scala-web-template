package au.id.gibsons.andrew.data

import org.springframework.data.annotation.Id

/**
 * Created by Andrew Gibson on 5/01/15.
 */
case class WebDoc(
                  @Id id: String,
                   url: String,
                   content: String
)
