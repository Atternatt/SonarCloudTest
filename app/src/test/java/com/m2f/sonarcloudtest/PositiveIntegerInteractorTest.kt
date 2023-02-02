package com.m2f.sonarcloudtest

import org.junit.Test

internal class PositiveIntegerInteractorTest {

    @Test
    fun `should return a positive value`() {
        val interactor = PositiveIntegerInteractor()
        assert(interactor.execute() > 0)
    }

    @Test
    fun `should return a pair value`() {
        val interactor = PositiveIntegerInteractor()
        assert(interactor.execute() % 2 == 0)
    }

    @Test
    fun `should return a multiple of 16`() {
        val interactor = PositiveIntegerInteractor()
        assert(interactor.execute() % 16 == 0)
    }


}