fun main() {
    var amount: Int = 35

    if(amount <= 35) {

        println("""Комиссия составляет $amount рублей.   
        Для зачисления положите большую сумму """)

    } else if (amount > 35) {

        var x: Double = amount * 0.75
        println("Cумма с комиссией составляет $x рублей")

        var sum: Double = x * 100
        println("Зачислено $sum копеек")
    }
}