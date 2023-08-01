package limah.jonas.bilheteria

import limah.jonas.entity.TypePerson

class DateVerify(var convite: String, val age: Int, var isMonday: Boolean) {
    var type: String = ""
    var price: Double = 0.0

    init {
            setType()
            setAge()

    }
    fun setType() {
        if (convite.trim() != "" && convite.trim() == TypePerson.criança.toString()) {
            this.type = convite
        } else if (convite.trim() != "" && convite.trim() == TypePerson.padrão.toString()) {
            this.type = convite
        } else if (convite.trim() != "" && convite.trim() == TypePerson.idoso.toString()) {
            this.type = convite
        } else {
            println("tipo inválido")
        }
    }
    fun setAge() {
        when (this.age) {
            in 0..12 -> println(
                "The movie ticket price for a person aged $type is \\$${
                    ticketPrice(type, isMonday).also( ::println)}.")
            in 13..60 -> println(
                "The movie ticket price for a person aged $type is" +
                "R$ ${ticketPrice(type,isMonday).also(::println)}.")
            else -> {println("The movie ticket price for a person aged " +
                    "$type is R$ ${ ticketPrice(type,isMonday).also(::println)}.")
            }
        }
    }

    fun ticketPrice(type: String, isMonday: Boolean): Double {
        if (type == TypePerson.criança.toString() && isMonday) {
            this.price = 15.00
        } else if (type == TypePerson.padrão.toString() && isMonday) {
            this.price = 25.00
        } else if (type == TypePerson.idoso.toString() && isMonday) {
            this.price = 20.00
        } else if (type == TypePerson.criança.toString()) {
            this.price = 15.00
        } else if (type == TypePerson.padrão.toString()) {
            this.price = 30.00
        } else if (type == TypePerson.idoso.toString()) {
            this.price = 30.00
        }
        return price
    }

}