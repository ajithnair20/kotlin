// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// KOTLIN_CONFIGURATION_FLAGS: +JVM.USE_OLD_INLINE_CLASSES_MANGLING_SCHEME
// DONT_TARGET_EXACT_BACKEND: WASM
// KJS_WITH_FULL_RUNTIME
// WITH_RUNTIME
import kotlin.test.*

fun box(): String {
    val uintList = mutableListOf<UInt>()
    val uintProgression = 1u..10u
    for (i in ((uintProgression step 2).reversed() step 3).reversed()) {
        uintList += i
    }
    assertEquals(listOf(3u, 6u, 9u), uintList)

    val ulongList = mutableListOf<ULong>()
    val ulongProgression = 1uL..10uL
    for (i in ((ulongProgression step 2L).reversed() step 3L).reversed()) {
        ulongList += i
    }
    assertEquals(listOf(3uL, 6uL, 9uL), ulongList)

    return "OK"
}