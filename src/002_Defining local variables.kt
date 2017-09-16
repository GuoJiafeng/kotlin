fun main(args: Array<String>) {
   test02()
}
  fun test01(){

      //Assign-once (read-only) local variable:  分配一次的只读的局部变量
      val a :Int = 5  //immediate assignment  直接分配值

      val b =4   // `Int` type is inferred  默认类型为Int

      val  c : Int  //Type required when no initializer is provided  不提供初始化器时所需的类型。

      c =3     // deferred assignment  间接分配值
      print("$a and $b  and  $c")
  }

fun  test02(){

    //Mutable variable:  可变变量
    var x= 5;  // `Int` type is inferred  int 是初始值
    x+1
    print(x)
}