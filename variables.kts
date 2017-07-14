/* val cannot be reassigned. */
// 合法
val name = "Yuki"
val address: String = "Okinawa"

// valで定義された変数に再代入は違法
val email: String = "example@gmail.com"
//email = "example@gmail.com"


/* var is a mutable variable. */
// varで定義されているなら再代入は合法
var name2: String = "Zayasu"
name2 = "Yuuki"

// 再定義は違法
//var name2 = "Zayasu"