// TARGET_BACKEND: JVM

context(T) class B<T : CharSequence> {
    val result = if (length == 2) "OK" else "fail"
}

fun box() = with("OK") {
    B().result
}