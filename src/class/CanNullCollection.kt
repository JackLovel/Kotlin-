package `class`

import java.io.BufferedReader
import java.io.FileReader
import java.lang.Exception
import java.lang.NumberFormatException

fun readNubmers(reader:BufferedReader) : List<String?> {
    val result = ArrayList<String?>()
    for (line in reader.lineSequence()) {
        try {
            result.add(line)
        } catch (e : NumberFormatException) {
            result.add(null)
        }
    }

    return result
}
