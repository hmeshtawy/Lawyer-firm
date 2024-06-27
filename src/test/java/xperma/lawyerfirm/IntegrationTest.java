package xperma.lawyerfirm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import xperma.lawyerfirm.config.AsyncSyncConfiguration;
import xperma.lawyerfirm.config.EmbeddedElasticsearch;
import xperma.lawyerfirm.config.EmbeddedKafka;
import xperma.lawyerfirm.config.EmbeddedRedis;
import xperma.lawyerfirm.config.EmbeddedSQL;
import xperma.lawyerfirm.config.JacksonConfiguration;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { LawyerFirmApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedElasticsearch
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {
}
