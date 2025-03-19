package com.example.myunittest

class MainViewModel(private val cuboidModel: CuboidModel) {
    fun getCircumference() = cuboidModel.getCircumference()
    fun getSurfaceArea() = cuboidModel.getSurfaceArea()
    fun getVolume() = cuboidModel.getVolueme()
    fun save(l: Double, w: Double, h: Double) {
        cuboidModel.save(l, w, h)
    }
}