package limah.jonas.bilheteria

import limah.jonas.entity.TypePerson

class Bilheteria() {
    init {
        verify()
    }

    fun verify() {
        var convite: String
        var age: Int = 0
        var isMonday: Boolean = false
        println(
            "Qual sera o tipo ne donvite?\n-Criança: pessoas de até 12 anos.\n-Padrão: pessoas de 13 até 60 anos." +
                    "\n-Idoso: pessoas acima de 60 anos."
        )
        convite = readln().trim()
        if (convite == TypePerson.criança.toString()) {
            println("Qual sua idade?")
            age = readln().toInt()
            if (age < 13) {
                println("É segunda ?")
                isMonday = readln().toBoolean()
                DateVerify(convite, age, isMonday)
                return
            }
        } else if (convite == TypePerson.padrão.toString()) {
            println("Qual sua idade?")
            age = readln().toInt()
            if (age > 12 && age < 61) {
                println("É segunda ?")
                isMonday = readln().toBoolean()
                DateVerify(convite, age, isMonday)
                return
            }
        } else if (convite == TypePerson.idoso.toString()) {
            println("Qual sua idade?")
            age = readln().toInt()
            if (age > 60) {
                println("É segunda ?")
                isMonday = readln().toBoolean()
                DateVerify(convite, age, isMonday)
                return
            }
        }


    }

}