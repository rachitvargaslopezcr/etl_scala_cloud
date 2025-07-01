package etl

import org.apache.spark.sql.{DataFrame, SparkSession}

object Extract {
  def fromMySQL(spark: SparkSession, jdbcUrl: String, 
  table: String, user: String, password: String): DataFrame = {

    val props = new java.util.Properties()
    props.setProperty("user", user)
    props.setProperty("password", password)
    props.setProperty("driver", "com.mysql.cj.jdbc.Driver")

    spark.read
      .jdbc(jdbcUrl, table, props)
  }
}