open class OpC (open val name: String, open val cognome: String, open val eta: Int) {

    fun stat(): String {

        return ("${name}  ${cognome}  ${eta} ")
    }
}