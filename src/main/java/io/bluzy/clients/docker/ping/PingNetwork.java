package io.bluzy.clients.docker.ping;

import io.bluzy.clients.docker.base.DockerConfig;
import io.bluzy.clients.docker.base.DockerNetwork;

public class PingNetwork extends DockerNetwork {

    private static final String NETWORK_NAME = "PingNetwork";

    public PingNetwork(DockerConfig dockerConfig) {
        super(dockerConfig.getUrl(), NETWORK_NAME);
    }
}
