package org.southwest.nasa.adc.server


import org.slf4j.LoggerFactory
import org.southwest.nasa.adc.server.Lib.Logger

/**
 * Will contain our main function for running the custom Javalin server
 */
const val VERSION = "1.0.0"
val Slf4JLogger = LoggerFactory.getLogger("Server")
val LOGGER = Logger
class Server {
    init {

    }
}

fun main() {
    // Acknowledge System req.
    LOGGER.log(
        "%s[Notice]%s - On %sCSV file split%s this application can use %sup to 500MB~%s sustained.",
        Logger.Color.RED,
        Logger.Color.RESET,
        Logger.Color.BLUE,
        Logger.Color.RESET,
        Logger.Color.PURPLE,
        Logger.Color.RESET
    )

}