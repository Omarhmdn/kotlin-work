// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "Median when size=1" {
        median(listOf(7f)) shouldBe 7f
    }

    "Median when size=2" {
        median(listOf(9f, 4f)) shouldBe (6.5f plusOrMinus 0.0001f)
    }

    "Median when size=3" {
        median(listOf(10f, 1f, 2f)) shouldBe 2f
    }

    "Median when size=4" {
        median(listOf(8f, 1f, 3f, 20f)) shouldBe (5.5f plusOrMinus 0.0001f)
    }

})
