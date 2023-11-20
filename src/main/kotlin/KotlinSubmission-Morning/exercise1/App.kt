package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val NamaDepan: String= "Muhammad Rizko"
    val NamaBelakang: String= "Sefta Al Hafiez"
    val Umur: Number= 20
    val Status: Boolean= false

    println("nama saya $NamaDepan$NamaBelakang")
    println("Umur saya $Umur tahun")
    println("Status saya saat ini masih")
    if (Status){
        println("Sudah menikah")
    }else{
        println("Single")
    }
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {

    println("Group ID: $groupId")
    println("Group Members: $groupMember")
    println("Session: $session")
    return ""
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val Anggota: List<Any> = listOf ("Agum Pratama", "Frida", "Mira", "M.Rizko","M.Rizky")
    return listOf(Anggota)
}
fun myMentor(): List<Any> {
    val Anggota: List<Any> = listOf ("Kak Hasan","Kak Yogi")
    return listOf(Anggota)
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kak Hasan","Kak Yogi")
    val countOfGroup = arrayOf<String>("Agum Pratama", "Frida", "Mira", "M.Rizko","M.Rizky")

    val totalMentor = mentor.size
    val totalAnggota = countOfGroup.size

    val total = totalMentor+totalAnggota

    return total
}

fun main() {

    myProfile()

    val myMentor = myMentor()
    println("Mentor Saya adalah : $myMentor")

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Dasa Impi", listOf("Agum Pratama", "Frida", "Mira", "M.Rizko","M.Rizky"), "Pagi")

}