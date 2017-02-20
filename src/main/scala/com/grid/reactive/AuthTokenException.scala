package com.grid.reactive

/**
  * Created by alexandru-petrisorpajarcu on 20/02/2017.
  */
class AuthTokenException(message: String = null, cause: Throwable = null) extends
  RuntimeException(AuthTokenException.defaultMessage(message, cause), cause)

object AuthTokenException {
  def defaultMessage(message: String, cause: Throwable) =
    if (message != null) message
    else if (cause != null) cause.toString()
    else null
}

