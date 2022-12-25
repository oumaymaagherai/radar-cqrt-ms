package ma.enset.infraction;

import com.thoughtworks.xstream.XStream;
import org.axonframework.commandhandling.CommandBus;
import org.axonframework.commandhandling.SimpleCommandBus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InfractionApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfractionApplication.class, args);
    }

    @Bean
    public CommandBus commandBus() {
        return SimpleCommandBus.builder().build();
    }

    @Bean
    public XStream xStream() {
        XStream xStream = new XStream();

        xStream.allowTypesByWildcard(new String[] { "ma.enset.**" });
        return xStream;
    }
}
