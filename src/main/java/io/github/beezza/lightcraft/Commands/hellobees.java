package io.github.beezza.lightcraft.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import static io.github.beezza.lightcraft.Environments.Vars.*;

public class hellobees implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!(sender.isOp())) {
            sender.sendMessage(noperm);
            return true;
        }
        sender.sendMessage("Hello Bees!");
        return true;
    }
}
