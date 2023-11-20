package id.infinitelearning.KotlinSubmission.exercise4

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    // contoh yang saya gunakan adalah kasus pembagian, jadi jika suatu bilangan di bagi dengan angka 0 maka akan keluar alert atau peringatan

        print("Masukkan angka yang ingin di bagi:")
        val inputA = readLine()

        print("Masukkan angka pembagi:")
        val inputB = readLine()

        try {
            if (inputA != null && inputB != null) {
                val a = inputA.toInt()
                val b = inputB.toInt()

                val result = divide(a, b)
                print("Hasil pembagian: $result")
            } else {
                throw IllegalArgumentException("Input tidak boleh kosong")
            }
        } catch (e: NumberFormatException) {
            print("Terjadi kesalahan konversi: ${e.message}")
        } catch (e: IllegalArgumentException) {
            print("Terjadi kesalahan: ${e.message}")
        }
    }

    fun divide(a: Int, b: Int): Int {
        if (b == 0) {
            throw IllegalArgumentException("Tidak bisa membagi oleh nol")
        }
        return a / b
    }


