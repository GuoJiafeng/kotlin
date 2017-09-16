package Kt001_基本要素_函数和变量.test

import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.ResultSet

/*
   @Author :Create by Guo Jiafeng

   @Date : Created in 17:22 2017/9/16 

   @Descripon : 
 
*/

fun main(args: Array<String>) {


    Class.forName("oracle.jdbc.OracleDriver")
    var conn: Connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "gjf044215")
    var rs: ResultSet
    var pstm: PreparedStatement

    var sql: String = "SELECT * FROM contact"

    pstm = conn.prepareStatement(sql)

    rs = pstm.executeQuery()
    var list1 = ArrayList<Contact>()
    var contact: Contact
    while (rs.next()) {
        contact = Contact(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4))
        list1.add(contact)

    }
    for (i in list1) {
        print(i.toString)
    }


}