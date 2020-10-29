package config

import java.sql.{Connection, DriverManager}

class H2DBConfig {
  val PARENT_DIR:String = "./data-dir"
  val DATABASE_NAME: String = "my-h2-db" // it's better if you write db name in small letters
  val DATABASE_DIR: String = s"$PARENT_DIR/$DATABASE_NAME" // FYI, this is string interpolation
  val DATABASE_URL: String = s"jdbc:h2:$DATABASE_DIR"
  def getConnection():Connection={
    val con: Connection = DriverManager.getConnection(DATABASE_URL)
    con
  }
}