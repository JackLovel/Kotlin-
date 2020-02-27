package IO

import java.io.*

/**
 *  file copy
 *  https://www.tutorialkart.com/kotlin/copy-content-of-one-file-to-other-file-in-kotlin/
 */
fun main() {
    var sourceFile : String = "C:\\Users\\gog\\Desktop\\打字记录.txt" // 原文件
    var destFile : String = "C:\\Users\\gog\\Desktop\\1.txt" // 目标文件
    File(sourceFile).copyTo(File(destFile), false);
}