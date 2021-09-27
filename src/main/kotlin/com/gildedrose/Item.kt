package com.gildedrose

open class Item(var name: String, var sellIn: Int, var quality: Int) {
    companion object {
        fun create(name: String, sellIn: Int, quality: Int) = when (name) {
            "Aged Brie" -> AgedBrie(name, sellIn, quality)
            "Backstage passes to a TAFKAL80ETC concert" -> BackstagePass(name, sellIn, quality)
            "Sulfuras, Hand of Ragnaros" -> Sulfuras(name, sellIn, quality)
            "Conjured Mana Cake" -> Conjured(name, sellIn, quality)
            else -> Item(name, sellIn, quality)
        }
    }

    open fun updateQuality() {
        if (quality > 0) {
            quality -= 1
        }

        sellIn -= 1

        if (sellIn < 0) {
            if (quality > 0) {
                quality -= 1
            }
        }
    }

    override fun toString(): String {
        return this.name + ", " + this.sellIn + ", " + this.quality
    }
}