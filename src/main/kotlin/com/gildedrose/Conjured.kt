package com.gildedrose

class Conjured(name: String, sellIn: Int, quality: Int) : Item(name, sellIn, quality) {
    override fun updateQuality() {
        if (quality > 0) {
            quality -= 2
        }

        sellIn -= 1

        if (sellIn < 0) {
            if (quality > 0) {
                quality -= 2
            }
        }
    }
}