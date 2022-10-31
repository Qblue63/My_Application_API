package net.gostartups.myapplication

data class CountryDetails(
    var name: String,
    var capital: String,
    var region: String,
    var population: Int,
    var area: Int,
    var flags: Flags2
)

data class Flags2(
    var svg: String,
    var png: String
)
