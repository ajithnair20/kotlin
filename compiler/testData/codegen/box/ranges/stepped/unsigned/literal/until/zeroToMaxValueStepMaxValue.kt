// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
<<<<<<< HEAD
// DONT_TARGET_EXACT_BACKEND: WASM
=======
// IGNORE_BACKEND_FIR: JVM_IR
>>>>>>> d6088d9796b... Ignore FIR tests
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in 0u until UInt.MAX_VALUE step Int.MAX_VALUE) {
        uintList += i
    }
    assertEquals(listOf(0u, 2147483647u, UInt.MAX_VALUE - 1u), uintList)

    val ulongList = mutableListOf<ULong>()
    for (i in 0uL until ULong.MAX_VALUE step Long.MAX_VALUE) {
        ulongList += i
    }
    assertEquals(listOf(0uL, 9223372036854775807uL, ULong.MAX_VALUE - 1uL), ulongList)

    return "OK"
}