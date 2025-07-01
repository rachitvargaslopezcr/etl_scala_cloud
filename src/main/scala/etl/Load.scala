package etl

import org.apache.spark.sql.{DataFrame}

object Load {
  def toCloudSQL(df: DataFrame, jdbcUrl: String, table: String, 
  user: String, password: String): Unit = {
    val props = new java.util.Properties()
    props.setProperty("user", user)
    props.setProperty("password", password)

    df.write
      .mode("overwrite")
      .jdbc(jdbcUrl, table, props)
  }
}
