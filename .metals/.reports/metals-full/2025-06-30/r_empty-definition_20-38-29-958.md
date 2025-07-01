error id: file://<HOME>/Documents/Data%20Enginering%20and%20Big%20Data/etl_with_sql_cloud/project/src/main/scala/etl/main.scala:`<none>`.
file://<HOME>/Documents/Data%20Enginering%20and%20Big%20Data/etl_with_sql_cloud/project/src/main/scala/etl/main.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -org/apache/spark/sql/SparkSession.
	 -org/apache/spark/sql/SparkSession#
	 -org/apache/spark/sql/SparkSession().
	 -SparkSession.
	 -SparkSession#
	 -SparkSession().
	 -scala/Predef.SparkSession.
	 -scala/Predef.SparkSession#
	 -scala/Predef.SparkSession().
offset: 42
uri: file://<HOME>/Documents/Data%20Enginering%20and%20Big%20Data/etl_with_sql_cloud/project/src/main/scala/etl/main.scala
text:
```scala
package etl

import org.apache.spark.sql.S@@parkSession

object Main {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("ETL Scala Project")
      .master("local[*]")
      .getOrCreate()

    // Parámetros
    val srcUrl = "jdbc:postgresql://localhost:5432/tu_base"
    val srcUser = "usuario"
    val srcPass = "clave"
    val srcTable = "nombre_tabla"

    val dstUrl = "jdbc:mysql://<endpoint>:3306/destino"
    val dstUser = "usuario_cloud"
    val dstPass = "clave_cloud"
    val dstTable = "tabla_destino"

    // ETL
    val raw = Extract.fromPostgres(spark, srcUrl, srcTable, srcUser, srcPass)
    val transformed = Transform(raw)
    Load.toCloudSQL(transformed, dstUrl, dstTable, dstUser, dstPass)

    spark.stop()
  }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.