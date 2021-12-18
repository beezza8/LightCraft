package io.github.beezza.lightcraft.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import static io.github.beezza.lightcraft.Environments.Vars.noperm;

public class rank implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender.isOp())) {
            sender.sendMessage(noperm);
            return true;
        }

        try {
            sender.getServer().getPlayerExact(args[0]).setDisplayName(args[1]);
        }catch(NullPointerException ignored) {
            sender.sendMessage("That player was not found!");
            return true;
        }

        return true;
    }
}
