import Array._

object dojo{
     def main(args: Array[String]) {
        //suma
        var sumaT= suma(2,9)
        println("suma: "+ sumaT)
        println

        //arreglo
        var array1=new Array[Int](2)
		array1(0)=1
		array1(1)=2
		println(array1(0))
		println

		//recorre arreglo
		for(i <- 0 to array1.length-1) {
			println("Arreglo")
			println(array1(i))
		}
		println

		//Matriz
		var nombre = "Scala"
		var matriz=ofDim[Int](2,2)
		println("Matriz")
		for(i <- 0 to 1){
			for(j<- 0 to 1){
				println(matriz(i)(j))
			}
		}
		println

		var array2=("Hola","Mundo")
		var array3=(1.2,.14)

		println ("La suma es " + dojo.suma(7,3))

		println
		println("")
		suma2 s=suma2(2,4)
      
    }
    def suma(x:Int,y:Int)=x+y
    	val suma2=((x:Int,y:Int) => x+y
}

