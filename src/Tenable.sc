import java.io.PrintWriter
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration.Inf
import scala.concurrent.{Await, Future}
object Solution {

  type Credentials = (String, String)
  type PointsAccountId = String
  type UserId = String

  final case class UserProfile(userId: UserId, name: String, pointsAccountId: PointsAccountId)

  val getToken: Credentials => Future[Option[String]] =

    creds => Future.successful {
      val (name, pass) = creds
      Some(name == pass).filter(identity).map(_ => name)
    }

  val fetchUserProfile: String => Future[UserProfile] =
    token => Future.successful(UserProfile(token, s"User-$token", token.length.toString))

  val pointsBalance: PointsAccountId => Future[Long] =
    accId => Future.successful(accId.toLong * 1000)

  val preferences: UserId => Future[Map[String, String]] =
    userId => Future.successful(Map("userId" -> userId, "active" -> "Y"))

  def userDetails(uname: String, pwd: String): Future[String] = {
   getToken(uname,pwd).flatMap {
     case Some(token) => fetchUserProfile(uname).flatMap {
       case profile => pointsBalance(profile.pointsAccountId).flatMap{
         case points => preferences(profile.userId).flatMap{
           case pref => Future.successful(s"${profile.name};${points};${pref}")
         }
       }
     }
     case None =>
       fetchUserProfile(uname).flatMap {
         case profile => Future.successful(s"${profile.name} not found")
       }

   }
  }
  Await.result(userDetails("Bob","Bob"),Inf)

}


