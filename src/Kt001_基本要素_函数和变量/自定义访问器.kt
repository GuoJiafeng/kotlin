package Kt001_基本要素_函数和变量

import java.util.*

/*
   @Author :Create by Guo Jiafeng

   @Date : Created in 17:02 2017/9/16 

   @Descripon : 
 
*/

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }

    val isChangfangxing: Boolean
        get() {
            return height != width
        }

    var name : String
    set(value) {
        name = value
    }
    get() {
        return name
    }



}

fun creatRandom():Rectangle{
    val reandom = Random()

    return Rectangle(reandom.nextInt(),reandom.nextInt())
}


fun main(args:Array<String >){
    print(creatRandom().isSquare)

}