package io.github.chlee7139

import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {

    override fun onEnable() {
        server.consoleSender.sendMessage("")
    }

    override fun onDisable() {
        server.consoleSender.sendMessage("")
    }
}