package org.trustedanalytics.atk.engine.model.plugins.collaborativefiltering

import spray.json._
import org.trustedanalytics.atk.domain.DomainJsonProtocol._

/** Json conversion for arguments and return value case classes */
object CollaborativeFilteringJsonFormat {

  implicit val cfTrainArgs = jsonFormat11(CollaborativeFilteringTrainArgs)
  implicit val cfScoreArgs = jsonFormat3(CollaborativeFilteringScoreArgs)
  implicit val cfPredictArgs = jsonFormat5(CollaborativeFilteringPredictArgs)
  implicit val cfRecommendArgs = jsonFormat4(CollaborativeFilteringRecommendArgs)
  implicit val cfReturnListString = jsonFormat1(CollaborativeFilteringRecommendReturn)
  implicit val cfFilterArgs = jsonFormat3(CollaborativeFilteringData)
}
