package net.mybrainlab.camp.settings;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "service.datasource")
@Getter
@Setter
public class CAMPSettings extends BaseDBSettings {
}
