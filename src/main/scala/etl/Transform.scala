package etl

import org.apache.spark.sql.{DataFrame}
import org.apache.spark.sql.functions._

object Transform {
  def apply(df: DataFrame): DataFrame = {
    df
      .filter(col("activo") === true)
      .withColumn("total_con_iva", col("precio") * 1.13)
      .withColumnRenamed("fecha_creacion", "fecha_registro")
  }
}
