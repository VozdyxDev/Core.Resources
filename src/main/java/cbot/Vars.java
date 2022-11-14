package Core.Resources;

import Core.Resources.components.ConfigUtils.Config;
import arc.files.Fi;
import arc.struct.ObjectMap;
import arc.util.CommandHandler;
import arc.util.serialization.Json;
import mindustry.type.Item;
import net.dv8tion.jda.api.JDA;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Vars {
    public static final Json json = new Json();
    public static final CommandHandler handler = new CommandHandler("");

    public static final Fi dataDirectory = Fi.get(".community");
    public static final Fi cache = dataDirectory.child("cache");
    public static final Fi resources = dataDirectory.child("resources");
    public static final Fi sprites = dataDirectory.child("sprites");

    public static final ObjectMap<String, BufferedImage> regions = new ObjectMap<>();
    public static final ObjectMap<Item, Long> emojis = new ObjectMap<>();

    public static Config config;
    //public static DiscordClient client;


    //public static GatewayDiscordClient gateway;
    public static JDA jda;

    public static BufferedImage currentImage;
    public static Graphics2D currentGraphics;
}