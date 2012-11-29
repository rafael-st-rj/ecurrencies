package ecurrencies.integration.amqp

interface Constants {

    // Properties
    static final String CONNECTION_FACTORY_CHANNEL_CACHE_SIZE = "CONNECTION_FACTORY_CHANNEL_CACHE_SIZE"
    static final String CONNECTION_FACTORY_HOSTNAME = "CONNECTION_FACTORY_HOSTNAME"
    static final String CONNECTION_FACTORY_VIRTUAL_HOST = "CONNECTION_FACTORY_VIRTUAL_HOST"
    static final String CONNECTION_FACTORY_USERNAME = "CONNECTION_FACTORY_USERNAME"
    static final String CONNECTION_FACTORY_PASSWORD = "CONNECTION_FACTORY_PASSWORD"
    static final String CONNECTION_FACTORY_PORT = "CONNECTION_FACTORY_PORT"

    static final String MESSAGE_LISTENER_ACKNOWLEDGE_MODE = "MESSAGE_LISTENER_ACKNOWLEDGE_MODE"
    static final String MESSAGE_LISTENER_CONCURRENT_CONSUMERS = "MESSAGE_LISTENER_CONCURRENT_CONSUMERS"
    static final String MESSAGE_LISTENER_PREFETCH_COUNT = "MESSAGE_LISTENER_PREFETCH_COUNT"

}