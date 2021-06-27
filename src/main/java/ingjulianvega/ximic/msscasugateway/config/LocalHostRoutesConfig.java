package ingjulianvega.ximic.msscasugateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!local-discovery")
public class LocalHostRoutesConfig {
    @Bean
    public RouteLocator localhostRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route("mssc-asu-visit-bff",
                        r -> r.path("/asu/v1/visit-bff/**")
                                .uri("http://localhost:8080"))
                .route("mssc-asu-visit",
                        r -> r.path("/asu/v1/visit/**")
                                .uri("http://localhost:8108"))
                .route("mssc-asu-billing",
                        r -> r.path("/asu/v1/billing/**")
                                .uri("http://localhost:8110"))
                .route("mssc-asu-visit-type",
                        r -> r.path("/asu/v1/visit-type/**")
                                .uri("http://localhost:8109"))
                .route("mssc-asu-patient",
                        r -> r.path("/asu/v1/patient/**")
                                .uri("http://localhost:8107"))
                .route("mssc-asu-companion",
                        r -> r.path("/asu/v1/companion/**")
                                .uri("http://localhost:8106"))
                .route("mssc-asu-recommendation",
                        r -> r.path("/asu/v1/recommendation/**")
                                .uri("http://localhost:8105"))
                .route("mssc-asu-body-check",
                        r -> r.path("/asu/v1/body-check/**")
                                .uri("http://localhost:8103"))
                .route("mssc-asu-system-check",
                        r -> r.path("/asu/v1/system-check/**")
                                .uri("http://localhost:8104"))
                .route("mssc-asu-treatment",
                        r -> r.path("/asu/v1/treatment/**")
                                .uri("http://localhost:8102"))
                .route("mssc-asu-disability",
                        r -> r.path("/asu/v1/disability/**")
                                .uri("http://localhost:8097"))
                .route("mssc-asu-remission",
                        r -> r.path("/asu/v1/remission/**")
                                .uri("http://localhost:8101"))
                .route("mssc-asu-evidence",
                        r -> r.path("/asu/v1/evidence/**")
                                .uri("http://localhost:8088"))
                .route("mssc-asu-concentration",
                        r -> r.path("/asu/v1/concentration/**")
                                .uri("http://localhost:8105"))
                .route("mssc-asu-remission-type",
                        r -> r.path("/asu/v1/remission-type/**")
                                .uri("http://localhost:8099"))
                .route("mssc-asu-disability-type",
                        r -> r.path("/asu/v1/disability-type/**")
                                .uri("http://localhost:8098"))
                .route("mssc-asu-recommendation-type",
                        r -> r.path("/asu/v1/recommendation-type/**")
                                .uri("http://localhost:8096"))
                .route("mssc-asu-duration",
                        r -> r.path("/asu/v1/duration/**")
                                .uri("http://localhost:8095"))
                .route("mssc-asu-administration-method",
                        r -> r.path("/asu/v1/administration-method/**")
                                .uri("http://localhost:8094"))
                .route("mssc-asu-medicine",
                        r -> r.path("/asu/v1/medicine/**")
                                .uri("http://localhost:8093"))
                .route("mssc-asu-body-part",
                        r -> r.path("/asu/v1/body-part/**")
                                .uri("http://localhost:8092"))
                .route("mssc-asu-intensity",
                        r -> r.path("/asu/v1/intensity/**")
                                .uri("http://localhost:8091"))
                .route("mssc-asu-symptom",
                        r -> r.path("/asu/v1/symptom/**")
                                .uri("http://localhost:8090"))
                .route("mssc-asu-system",
                        r -> r.path("/asu/v1/system/**")
                                .uri("http://localhost:8089"))
                .route("mssc-asu-evidence-type",
                        r -> r.path("/asu/v1/evidence-type/**")
                                .uri("http://localhost:8100"))
                .route("mssc-asu-disease",
                        r -> r.path("/asu/v1/disease/**")
                                .uri("http://localhost:8087"))
                .route("mssc-asu-document-type",
                        r -> r.path("/asu/v1/document-type/**")
                                .uri("http://localhost:8085"))
                .route("mssc-asu-arl",
                        r -> r.path("/asu/v1/arl/**")
                                .uri("http://localhost:8084"))
                .route("mssc-asu-eps",
                        r -> r.path("/asu/v1/eps/**")
                                .uri("http://localhost:8083"))
                .route("mssc-asu-occupation",
                        r -> r.path("/asu/v1/occupation/**")
                                .uri("http://localhost:8082"))
                .route("mssc-asu-gender",
                        r -> r.path("/asu/v1/gender/**")
                                .uri("http://localhost:8081"))
                .route("mssc-asu-marital-status",
                        r -> r.path("/asu/v1/marital-status/**")
                                .uri("http://localhost:8080"))
                .build();
    }
}
