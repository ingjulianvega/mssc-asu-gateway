package ingjulianvega.ximic.msscasugateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("local-discovery")
@Configuration
public class LoadBalancedRoutesConfig {
    @Bean
    public RouteLocator loadBalancedRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route("mssc-asu-visit-bff",
                        r -> r.path("/asu/v1/visit-bff/**")
                                .uri("lb://mssc-asu-visit-bff"))
                .route("mssc-asu-visit",
                        r -> r.path("/asu/v1/visit/**")
                                .uri("lb://mssc-asu-visit"))
                .route("mssc-asu-billing",
                        r -> r.path("/asu/v1/billing/**")
                                .uri("lb://mssc-asu-billing"))
                .route("mssc-asu-visit-type",
                        r -> r.path("/asu/v1/visit-type/**")
                                .uri("lb://mssc-asu-visit-type"))
                .route("mssc-asu-patient",
                        r -> r.path("/asu/v1/patient/**")
                                .uri("lb://mssc-asu-patient"))
                .route("mssc-asu-companion",
                        r -> r.path("/asu/v1/companion/**")
                                .uri("lb://mssc-asu-companion"))
                .route("mssc-asu-recommendation",
                        r -> r.path("/asu/v1/recommendation/**")
                                .uri("lb://mssc-asu-recommendation"))
                .route("mssc-asu-body-check",
                        r -> r.path("/asu/v1/body-check/**")
                                .uri("lb://mssc-asu-body-check"))
                .route("mssc-asu-system-check",
                        r -> r.path("/asu/v1/system-check/**")
                                .uri("lb://mssc-asu-system-check"))
                .route("mssc-asu-treatment",
                        r -> r.path("/asu/v1/treatment/**")
                                .uri("lb://mssc-asu-treatment"))
                .route("mssc-asu-disability",
                        r -> r.path("/asu/v1/disability/**")
                                .uri("lb://mssc-asu-disability"))
                .route("mssc-asu-remission",
                        r -> r.path("/asu/v1/remission/**")
                                .uri("lb://mssc-asu-remission"))
                .route("mssc-asu-evidence",
                        r -> r.path("/asu/v1/evidence/**")
                                .uri("lb://mssc-asu-evidence"))
                .route("mssc-asu-concentration",
                        r -> r.path("/asu/v1/concentration/**")
                                .uri("lb://mssc-asu-concentration"))
                .route("mssc-asu-remission-type",
                        r -> r.path("/asu/v1/remission-type/**")
                                .uri("lb://mssc-asu-remission-type"))
                .route("mssc-asu-disability-type",
                        r -> r.path("/asu/v1/disability-type/**")
                                .uri("lb://mssc-asu-disability-type"))
                .route("mssc-asu-recommendation-type",
                        r -> r.path("/asu/v1/recommendation-type/**")
                                .uri("lb://mssc-asu-recommendation-type"))
                .route("mssc-asu-duration",
                        r -> r.path("/asu/v1/duration/**")
                                .uri("lb://mssc-asu-duration"))
                .route("mssc-asu-administration-method",
                        r -> r.path("/asu/v1/administration-method/**")
                                .uri("lb://mssc-asu-administration-method"))
                .route("mssc-asu-medicine",
                        r -> r.path("/asu/v1/medicine/**")
                                .uri("lb://mssc-asu-medicine"))
                .route("mssc-asu-body-part",
                        r -> r.path("/asu/v1/body-part/**")
                                .uri("lb://mssc-asu-body-part"))
                .route("mssc-asu-intensity",
                        r -> r.path("/asu/v1/intensity/**")
                                .uri("lb://mssc-asu-intensity"))
                .route("mssc-asu-symptom",
                        r -> r.path("/asu/v1/symptom/**")
                                .uri("lb://mssc-asu-symptom"))
                .route("mssc-asu-system",
                        r -> r.path("/asu/v1/system/**")
                                .uri("lb://mssc-asu-system"))
                .route("mssc-asu-evidence-type",
                        r -> r.path("/asu/v1/evidence-type/**")
                                .uri("lb://mssc-asu-evidence-type"))
                .route("mssc-asu-disease",
                        r -> r.path("/asu/v1/disease/**")
                                .uri("lb://mssc-asu-disease"))
                .route("mssc-asu-document-type",
                        r -> r.path("/asu/v1/document-type/**")
                                .uri("lb://mssc-asu-document-type"))
                .route("mssc-asu-arl",
                        r -> r.path("/asu/v1/arl/**")
                                .uri("lb://mssc-asu-arl"))
                .route("mssc-asu-eps",
                        r -> r.path("/asu/v1/eps/**")
                                .uri("lb://mssc-asu-eps"))
                .route("mssc-asu-occupation",
                        r -> r.path("/asu/v1/occupation/**")
                                .uri("lb://mssc-asu-occupation"))
                .route("mssc-asu-gender",
                        r -> r.path("/asu/v1/gender/**")
                                .uri("lb://mssc-asu-gender"))
                .route("mssc-asu-marital-status",
                        r -> r.path("/asu/v1/marital-status/**")
                                .uri("lb://mssc-asu-marital-status"))
                .build();
    }
}
