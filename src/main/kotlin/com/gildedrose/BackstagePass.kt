package com.gildedrose

class BackstagePass(name: String, sellIn: Int, quality: Int) : Item(name, sellIn, quality) {

    override fun updateQuality() {
        if (quality < 50) {
            quality += 1

            if (sellIn < 11) {
                if (quality < 50) {
                    quality += 1
                }
            }

            if (sellIn < 6) {
                if (quality < 50) {
                    quality += 1
                }
            }
        }

        sellIn -= 1

        if (sellIn < 0) {
            quality = 0
        }
    }
}