//Nos creamos una variable spark de tipo SparkSession
//SparkSession sera el objeto principal para ña funcionalidad de apache spark
//.builder() empezamos a construir la session
val spark: SparkSession = SparkSession.builder()
    .master("local[*]")
    .appName("simple-app")
    .getOrCreate()
//Aca creamos una variable dataSet para poder hacer lectura de un archivo csv(excel)    
val dataSet: Dataset[String] = spark.read.textFile("textfile.csv")
val df: DataFrame = dataSet.toDF()
