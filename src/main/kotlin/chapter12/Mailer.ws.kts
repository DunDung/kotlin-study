import java.lang.StringBuilder

class Mailer {
    val details = StringBuilder()
    fun from(addr: String) = details.append("from $addr... \n")
    fun to(addr: String) = details.append("to $addr... \n")
    fun send() = "sending..! \n$details"
}

//val mailer = Mailer()
//mailer.from("dundung@woowahan.com")
//mailer.to("junseong@woowahan.com")
//val result = mailer.send();
//println(result)

//val mailer = Mailer()
//    .apply { from("dundung@woowahan.com")}
//    .apply { to("dundung@woowahan.com")}
//val result = mailer.send();
//println(result)

//val result = Mailer().run {
//    from("dundung@woowahan.com")
//    to("junseong@woowahan.com")
//    send()
//}
//print(result)

fun createMailer() = Mailer()
fun prepareMailer(mailer: Mailer): Unit {
    mailer.run {
        from("dundung@woowahan.com")
        to("junseong@woowahan.com")
    }
}
fun sendMail(mailer: Mailer): Unit {
    mailer.send()
    println("Mail sent")
}
val mailer = createMailer()
prepareMailer(mailer)
sendMail(mailer)