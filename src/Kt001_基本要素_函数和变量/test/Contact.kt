package Kt001_基本要素_函数和变量.test

/*
   @Author :Create by Guo Jiafeng

   @Date : Created in 17:20 2017/9/16 

   @Descripon : 
 
*/

class  Contact(
        var id:Int,
        var name:String,
        var salary:Double,
        var age:Int
){
    val toString :String
    get() {
        return "$id --- $name --- $salary ---$age"
    }
}