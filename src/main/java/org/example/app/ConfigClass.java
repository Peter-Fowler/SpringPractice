package org.example.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = { "application-context.xml" })
public class ConfigClass { }
