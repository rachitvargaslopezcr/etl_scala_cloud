package etl

import org.apache.spark.sql.SparkSession

object Main {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("ETL Scala Project")
      .master("local[*]")
      .getOrCreate()

    val jdbcUrl = "jdbc:mysql://localhost:3306/etl_project_01"
    val usuario = "root"
    val clave = ""

    val tablaOrigen = "ventas_batidos"
    val tablaDestino = "ventas_transformadas"

    val raw = Extract.fromMySQL(spark, jdbcUrl, tablaOrigen, usuario, clave)
    val transformed = Transform(raw)
    Load.toCloudSQL(transformed, jdbcUrl, tablaDestino, usuario, clave)

    spark.stop()
  }
}