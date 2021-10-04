fun main(args:Array<String>){
    var number = 987654
    var reverse = 0
    while (number !=0){
        val remainder = number%10
        reverse =   reverse*10+remainder
        number /= 10

    }
    print(reverse)


}