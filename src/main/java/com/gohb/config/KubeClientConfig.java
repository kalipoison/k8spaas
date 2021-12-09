package com.gohb.config;


import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.util.ClientBuilder;
import io.kubernetes.client.util.KubeConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileReader;
import java.io.IOException;

@Configuration
public class KubeClientConfig {

    private static final Logger logger = LoggerFactory.getLogger(KubeClientConfig.class);

    @Bean
    public ApiClient apiClient() {
        String kubeConfigPath = "config";
        ApiClient client = null;
        try {
            client = ClientBuilder.kubeconfig(KubeConfig.loadKubeConfig(new FileReader(kubeConfigPath))).build();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return client;
    }

    @Bean
    public CoreV1Api coreV1Api(ApiClient client) {
        io.kubernetes.client.openapi.Configuration.setDefaultApiClient(client);
        return new CoreV1Api();
    }

}
