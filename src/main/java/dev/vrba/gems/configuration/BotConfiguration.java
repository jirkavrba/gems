package dev.vrba.gems.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.lang.NonNull;

@ConfigurationProperties(prefix = "bot")
public record BotConfiguration(@NonNull String token) {}
