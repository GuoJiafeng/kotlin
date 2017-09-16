package Kt001_基本要素_函数和变量

/*
   @Author :Create by Guo Jiafeng

   @Date : Created in 16:49 2017/9/16 

   @Descripon : 
 
*/


class Person2 (val name :String)

//这是一个简单的kt 实体类  里面包含了一个name


//在kt中不需要书写set get方法 在调用是直接方法名.属性名就行


fun main(args : Array<String>){
    val  person = Person("gjf",false)
    print(person.name+"   "+person.isMarried)


}