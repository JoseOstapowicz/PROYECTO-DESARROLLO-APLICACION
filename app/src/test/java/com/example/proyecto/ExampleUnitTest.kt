package com.example.proyecto

import org.junit.Assert
import org.junit.Test


class MainViewModelTest {
    @Test
    fun testCompareStrings() {
        val viewModel = MainViewModel()
        val result = viewModel.compareStrings("abc", "abc")
        Assert.assertTrue(result)
    }
}
