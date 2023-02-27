fun main() {
    val names = mutableListOf<String>()
    
    for (i in 1..3) {
        print("Enter name $i: ")
        val name = readLine() ?: ""
        names.add(name)
    }
    
    names.sort()
    
    println("Sorted names:")
    for (name in names) {
        println(name)
    }
}
