interface Interface {

    val name : String
    val cognome : String
    val eta : Int

    fun stat (): String {

        return ("${name}  ${cognome}  ${eta} ")
    }
}