//RDD es un seervicio que nos ofrece optimizar la gestion de los macrodatos
//creamos un array llamado cadenas con los datos Docentes,IA,quefinal
val cadenas = Array(“Docentes”, “inteligenciaArtificial”, “quefinal”)

val cadenasRDD = sc.parallelize (cadenas)
cadenasRDD.collect()
file.collect()
val filtro = cadenasRDD.filter(line => line.contains(“quefinal”))
val fileNotFound = sc.textFile(“/7añljdlsjd/alkls/”, 6)
fileNotFound.collect()
