import java.net.HttpURLConnection
import java.net.URL
import java.io.OutputStreamWriter

fun main() {
    println("Register a user:")
    print("Username: ")
    val username = readLine()!!
    print("Password: ")
    val password = readLine()!!

    val jsonPayload = """{"username":"\$username","password":"\$password"}"""

    val url = URL("http://localhost:8081/register")
    with(url.openConnection() as HttpURLConnection) {
        requestMethod = "POST"
        setRequestProperty("Content-Type", "application/json")
        doOutput = true

        val writer = OutputStreamWriter(outputStream)
        writer.write(jsonPayload)
        writer.flush()

        println("Response Code: \$responseCode")
    }
}
