//creamos una variable StreamingContext
val streamingContext: StreamingContext = new StreamingContext(sparkContext, Seconds(20))
//creamos una variable de tipo ReceiverInputDStream donde le colocaremos la variable anteriormente creada
// y ademas le daremos de parametros el nombre del puerto(localhost) y el puerto(9999)
val lines: ReceiverInputDStream[String] = streamingContext.socketTextStream("localhost", 9999)
