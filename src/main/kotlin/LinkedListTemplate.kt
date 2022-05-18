class Node(val value: Int, var next: Node?)

fun main() {
    val input = Node(1, Node(2, Node(3, Node(4, null))))
    print(input)
}

fun print(firstNode: Node) {
    var currentNode: Node? = firstNode

    while (currentNode != null) {

        print("${currentNode.value}, ")
        currentNode = currentNode.next

    }

}
