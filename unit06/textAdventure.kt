
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var currentRoom = "dusty castle room"

    while (true) {
        when (currentRoom) {
            "dusty castle room" -> {
                println("You are in a dusty castle room.")
                println("Passages lead to the north and south.")
                println("What direction?")

                val direction = scanner.nextLine()
                if (direction == "n") {
                    currentRoom = "armory"
                } else if (direction == "s") {
                    currentRoom = "torch-lit hallway"
                }
            }
            "armory" -> {
                println("You are in the armory.")
                println("There is a room off to the south.")
                println("What direction?")

                val direction = scanner.nextLine()
                if (direction == "s") {
                    currentRoom = "dusty castle room"
                }
            }
            "torch-lit hallway" -> {
                println("You are in a torch-lit hallway.")
                println("There are rooms to the east and west.")
                println("What direction?")

                val direction = scanner.nextLine()
                if (direction == "e") {
                    currentRoom = "bedroom"
                } else if (direction == "w") {
                    currentRoom = "kitchen"
                }
            }
            "bedroom" -> {
                println("You are in a bedroom. A window overlooks the castle courtyard.")
                println("A hallway is to the west.")
                println("What direction?")

                val direction = scanner.nextLine()
                if (direction == "w") {
                    currentRoom = "torch-lit hallway"
                }
            }
            "kitchen" -> {
                println("You are in the kitchen. It looks like a roast is being made for supper.")
                println("A hallway is to the east.")
                println("What direction?")

                val direction = scanner.nextLine()
                if (direction == "w") {
                    currentRoom = "torch-lit hallway"
                } else {
                    println("Can't go that way.")
                }
            }
        }
    }
}
