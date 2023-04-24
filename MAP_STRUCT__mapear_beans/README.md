
# Mapear clases beans

En gradle la dependencia `annotationProcessor` se usa para procesar las anotaciones en el tiempo de compilacion 

MapStruct no tiene dependencias en el tiemo de ejecuccion 
Utiliza invocaciones de métodos en vez de reflexión, no tiene dependencias en tiempo de ejecución


Ejecutar todos los tests
```
gradle clean test
```

Ejecutar un test
```
gradle test --tests 'com.ruben.MapperTest.givenMapearPorDefecto_whenMaps_thenCorrect'
```

Documentacion:
https://www.tutorialspoint.com/mapstruct/mapstruct_basic_mapping.htm
