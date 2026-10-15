// Task 6.5: unit tests for grade()

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


@Suppress("unused")
class GradeTest : FreeSpec({
    // Write your tests in here
    "Mark of 0 gives a Fail" {
        grade(0) shouldBe "Fail"}
    "Mark of 10 gives a Fail" {
        grade(10) shouldBe "Fail"}
    "Mark of 20 gives a Fail" {
        grade(20) shouldBe "Fail"}
    "Mark of 30 gives a Fail" {
        grade(30) shouldBe "Fail"}
    "Mark of 50 gives a Pass" {
        grade(50) shouldBe "Pass"}
    "Mark of 55 gives a Pass" {
        grade(55) shouldBe "Pass"}
    "Mark of 60 gives a Pass" {    
        grade(60) shouldBe "Pass"}
    "Mark of 65 gives a Pass" {
        grade(65) shouldBe "Pass"}
    "Mark of 70 gives a Distinction" {
        grade(70) shouldBe "Distinction"}
    "Mark of 80 gives a Distinction" {
        grade(80) shouldBe "Distinction"}
    "Mark of 100 gives a Distinction" {
        grade(100) shouldBe "Distinction"}

})
