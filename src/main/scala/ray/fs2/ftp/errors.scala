package ray.fs2.ftp

import java.io.IOException

case class ConnectionError(message: String, cause: Throwable) extends IOException(message, cause)

object ConnectionError {
  def apply(message: String): ConnectionError  = new ConnectionError(message, new Throwable(message))
  def apply(cause: Throwable): ConnectionError = new ConnectionError(cause.getMessage, cause)
}

case class InvalidPathError(message: String) extends IOException(message)
