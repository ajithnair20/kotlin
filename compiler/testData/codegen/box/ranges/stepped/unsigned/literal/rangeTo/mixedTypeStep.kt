// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// KOTLIN_CONFIGURATION_FLAGS: +JVM.USE_OLD_INLINE_CLASSES_MANGLING_SCHEME
// DONT_TARGET_EXACT_BACKEND: WASM
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    for (i in 1.toUByte()..7.toUByte() step 2) {
        uintList += i
    }
    assertEquals(listOf(1u, 3u, 5u, 7u), uintList)

    return "OK"
}