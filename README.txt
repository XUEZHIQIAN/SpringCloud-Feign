一、模块之间关系
1.
    SpringCloud-Eureka Eureka服务
    SpringCloud-Api Eureka对外暴露接口
    SpringCloud-Order 接口实现类
    test ——> Api ——> (feign) ——> Order
2.
    SpringCloud-Msg Kafka消息发送者
    SpringCloud-User Kafka消息接收者
    Msg ——> (kafka) ——> User
3.
    Dubbo-Service Dubbo对外暴露接口
    invoke com.hang.cloud.service.BaseInfoService.queryBaseInfoById(1)

二、kafka启动和测试
1.
    启动zookeeper
    bin\windows\zookeeper-server-start.bat config\zookeeper.properties
2.
    启动kafka
    bin\windows\kafka-server-start.bat config\server.properties
3.
    创建topic
    bin\windows\kafka-topics.bat --create --topic topic_user --replication-factor 1 --partitions 1 --zookeeper localhost:2181
    查看topic
    bin\windows\kafka-topics.bat --list --zookeeper localhost:2181
    查看topic详情
    bin\windows\kafka-topics.bat --zookeeper 127.0.0.1:2181 --topic topic_user --describe
4.
    启动producer
    bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic topic_user
5.
    启动consumer
    bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic topic_user --from-beginning