import java.util.*
import kotlin.collections.ArrayDeque

fun main() {

    val stack = Stack<String>()

    stack.push("Item")
    println(stack.peek())

    stack.push("Item2")
    val pop = stack.pop()

    println(pop)

    println(stack.empty())

    val arrayDeque = ArrayDeque<String>()

    //Always try and use addFirst or addLast instead of add

    arrayDeque.addLast("Item1")
    println(arrayDeque)

    arrayDeque.addLast("Item2")
    arrayDeque.addFirst("Item0")
    println(arrayDeque)

    val last = arrayDeque.removeLast()
    val first = arrayDeque.removeFirst()
    println("first is $first and last is $last")
    println(arrayDeque)

}

