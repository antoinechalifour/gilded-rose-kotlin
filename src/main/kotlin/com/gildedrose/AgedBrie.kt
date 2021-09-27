package com.gildedrose

class AgedBrie(name: String, sellIn: Int, quality: Int) : Item(name, sellIn, quality) {
    override fun updateQuality() {
        if (quality < 50) {
            quality += 1
        }

        sellIn -= 1

        if (sellIn < 0) {
            if (quality < 50) {
                quality += 1
            }
        }
    }
}