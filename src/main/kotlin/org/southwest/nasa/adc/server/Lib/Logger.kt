package org.southwest.nasa.adc.server.Lib

object Logger {
     object Color {
        val BLACK = "\u001B[30m"
        val RED = "\u001B[31m"
        val GREEN = "\u001B[32m"
        val YELLOW = "\u001B[33m"
        val BLUE = "\u001B[34m"
        val PURPLE = "\u001B[35m"
        val CYAN = "\u001B[36m"
        val WHITE = "\u001B[37m"
        val RESET = "\u001B[0m"
    }
    fun log(template: String?, vararg props: String?) {
        val args = arrayOfNulls<String>(props.size + 1)
        System.arraycopy(props, 0, args, 0, props.size)
        println(String.format(template!!, *args))
    }
}
