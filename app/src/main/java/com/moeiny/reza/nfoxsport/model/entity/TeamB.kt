package com.moeiny.reza.nfoxsport.model.entity

data class TeamB(
    val code: String,
    val id: Int,
    val name: String,
    val short_name: String,
    val top_players: List<TopPlayer>
)