package io.bluzy.clients.docker.base;

public enum DockerConfig {
    LOCAL_HOST_URL("tcp://localhost:2375"), UNIX_SOCKET_URL("unix:///var/run/docker.sock");

    private final String url;

    private DockerConfig(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
