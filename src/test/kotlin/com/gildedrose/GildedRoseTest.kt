package com.gildedrose

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvFileSource

internal class GildedRoseTest {

    @ParameterizedTest
    @CsvFileSource(resources = ["/gildedrose.csv"], numLinesToSkip = 1)
    fun updateQualityTest(name: String, sellIn: Int, quality: Int, expectedSellIn: Int, expectedQuality: Int) {
        val items = arrayOf(Item.create(name, sellIn, quality))
        GildedRose(items).updateQuality()
        assertThat(GildedRose(items).items[0]).hasToString("$name, $expectedSellIn, $expectedQuality")
    }

}


