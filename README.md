# GeneradorCodigoJava
## Integrantes
### **Dwan Felipe Veloza Paez**
### **Diego Alejandro Hernandez Martinez **

Con este proyecto hemos desarrollado un generador de código para Java a partir de TextX y jinja 2 por python.

Para este ejemplo en particular creamos un concepto inicial que llamaremos Banda en la cual creamos diferentes entidades con sus propiedades a las que se les definie por un tipo y un nombre.

![](https://scontent.fclo1-2.fna.fbcdn.net/v/t1.0-9/34534673_1679653362153684_8138325674248110080_n.jpg?_nc_cat=0&_nc_eui2=AeGGEWHfnccx0OXSpJw7SCULtzXLy1t1LeiIkYI2hzQcOX5Vnx9hgqp7sG5VPKOylUwRpgkdwQ1DG5fJhey7WCYmvPj4rx0ArXpDhid4rIIIiQ&oh=37857123f306c5acd3b38c63ba4fb733&oe=5B81B78F)

textX no impone ninguna biblioteca o proceso específico para la generación de código fuente. Por lo tanto Jinja 2 nos permite generar código en java sin ningun problema a partir de nuestros modelos de entidades que son archivos java.template como se ve en la imágen:

![](https://scontent.fclo1-2.fna.fbcdn.net/v/t1.0-9/34343427_1679656025486751_5718603926463315968_n.jpg?_nc_cat=0&_nc_eui2=AeFh0u8LsWfZfe7lLKZdbp4X1rqZnxriyP7y27HuGIbMQXv4F66fH1NHc31nchwLztZp1nwoD4HVr4OUJ9q3K3sEsN7UT1tUeZE9V7l4_jIIKw&oh=4d26bfe69c538cb5945feb125967cfd5&oe=5BBEFDF9)

Para que podamos ver nuestro ejemplo como una clase en java, python nos permite utilizar un filtro que transformará el objeto dado en algún otro objeto, en este caso un javatype que relaciona el tipo de dato adecuado.

![](https://scontent.fclo1-2.fna.fbcdn.net/v/t1.0-9/34395320_1679655765486777_2270127319605575680_n.jpg?_nc_cat=0&_nc_eui2=AeG_hESWtjc1r4zoc_XnTC-egNqJEfaOHn7s40DwAhucmXFb0hPOEK0ho7TGJsEmm-FMDT1xcP1auCm8D7xVY0Nge0GSJVt_6w1ape6-Q1vmRw&oh=f615721e1e9243d49dcea16a20ddd7fc&oe=5BB23A6D)

Ahora, veamos cómo podemos armar esto. Necesitamos inicializar el motor Jinja2, instanciar nuestro metamodelo, cargar nuestro modelo y luego iterar sobre las entidades de nuestro modelo y generar un archivo Java para cada entidad:

![](https://scontent.fclo1-2.fna.fbcdn.net/v/t1.0-9/34343443_1679656138820073_5174053084657090560_n.jpg?_nc_cat=0&_nc_eui2=AeE8J0lXXSGLs6gOYO8KV2xbtFdtnFlh8AZnBELEq-hgb3Y1DDLOe73DXpH0MA7w4ab8QEp7XAEhn0HwEqN9cApOk4JHamALqDTi8Gx8afsNHQ&oh=2a392e618270e6a4eed823d7edf7f339&oe=5B86B758)

![](https://scontent.fclo1-2.fna.fbcdn.net/v/t1.0-9/34483044_1679655848820102_2181216591725723648_n.jpg?_nc_cat=0&_nc_eui2=AeFZPkr98_pR0dgM9hHUhITVd9TmelD82S0WEIHjylsiLV_Xu0CIjBZ2WXG0w-UVJIRafnVfy35uDu2PAIcM3hchR7VSqmqLxfxyohKoEZowEw&oh=736fd9103826c1889a967cc8eebeb111&oe=5BC21E6E)

Por último el resultado de la entidad Instrumentos como código generado será así:

![](https://scontent.fclo1-2.fna.fbcdn.net/v/t1.0-9/34367991_1679660468819640_7249026638044725248_n.jpg?_nc_cat=0&_nc_eui2=AeGfaVp-fm5m27wz7TAerzZ7DBB-eoJLhHiERGPQc9DW19281z1Bt0J6eXsJy2WPaf9YfzYKp24iu7648v01G635Rbz9hV5BC0cKoB4hg7tzyw&oh=cfed4c3eff693fe8fe55cc251ae0172b&oe=5B795092)


Recordemos que la consrucion de nuestro metamodelo esta dado por la utilizacion de una gramatica definida dentto de **entity.tx** y cada una de las entindades elaboradas, pertenecientes possen la extension *.ent*   

Una de las caracteristicas de nuestro DSL, es permitir la generacion de codigo de forma automatica, de tareas que usualmente se repiten 
