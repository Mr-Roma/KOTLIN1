//Name      : Romario Viegas Francisco Marcal
//NIM       : 1301225492


//Buatlah sebuah program untuk mencetak angka 1 hingga 10 dan menampilkan keterangan "ganjil" atau "genap" di samping angka tersebut menggunakan loop for.
fun main() {
    var grade : Int = 70
    println("-------------------")
    println("PERTANYAAN NOMOR 1")
    println("-------------------")
    for (i in 1..10) {
        if (i % 2 == 0) {
            println("$i adalah bilangan genap")
        } else {
            println("$i adalah bilangan ganjil")
        }
    }
    //Buatlah sebuah program untuk mencetak angka genap dari 2 hingga 20 dan menampilkan hasil perkalian angka tersebut dengan 5 menggunakan loop while.
    println("-------------------")
    println("PERTANYAAN NOMOR 2")
    println("-------------------")
    calculate()
    //Buatlah sebuah program untuk menghitung hasil penjumlahan dari 1 hingga 20 dan menampilkan hasil penjumlahan setiap saat menggunakan loop do-while.
    println("-------------------")
    println("PERTANYAAN NOMOR 3")
    println("-------------------")
    calculate2()

    //Buatlah sebuah program untuk menentukan grade berdasarkan nilai yang diberikan dengan menggunakan when expression dan menampilkan keterangan "lulus" atau "tidak lulus" untuk nilai yang kurang dari 70.
    println("-------------------")
    println("PERTANYAAN NOMOR 4")
    println("-------------------")
    println(menentukanGrade(grade))
}

fun calculate() {
    for (i in 2..20) {
        if (i % 2 == 0) {
            println("$i adalah bilangan genap")
            println(i * 5)
        }
    }
}

fun calculate2() {
    var sum = 0
    var i = 1

    do {
        sum += i
        println("Hasil penjumlahan saat ini adalah $sum")
        i++
    } while (i <= 20)
}

fun menentukanGrade(grade: Int) {
    when {
        grade >= 70 -> println("Mahasiswa ini Lulus")
        grade < 70 -> println("Mahasiswa ini Tidak Lulus")
        else -> println("Nilai tidak sesuai dengan pedoman nilai")
    }
}

