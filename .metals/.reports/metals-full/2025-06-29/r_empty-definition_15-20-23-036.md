error id: file://<HOME>/Documents/Data%20Enginering%20and%20Big%20Data/etl_with_sql_cloud/project/src/main/scala/etl/Extract.scala:`<none>`.
file://<HOME>/Documents/Data%20Enginering%20and%20Big%20Data/etl_with_sql_cloud/project/src/main/scala/etl/Extract.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 379
uri: file://<HOME>/Documents/Data%20Enginering%20and%20Big%20Data/etl_with_sql_cloud/project/src/main/scala/etl/Extract.scala
text:
```scala
package etl

import org.apache.spark.sql.{DataFrame, SparkSession}

object Extract {
  def fromMySQL(spark: SparkSession, jdbcUrl: String, 
  table: String, user: String, password: String): DataFrame = {
    val props = new java.util.Properties()
    props.setProperty("user", user)
    props.setProperty("password", password)
    props.setProperty("driver", "com.mysql.cj.jdbc.D@@river") // Importante para MySQL

    spark.read
      .jdbc(jdbcUrl, table, props)
  }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.