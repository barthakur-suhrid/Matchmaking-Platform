package com.stackroute.locationservice.domain;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
This class is responsible for removing the hard coded data for the kafka service
 */

@Component
@ConfigurationProperties("kafka")
public class KafkaProperties {
    private String ipAddress;
    private String groupId;
    private String outputTopic;
    private String listeningTopic;

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getOutputTopic() {
        return outputTopic;
    }

    public void setOutputTopic(String outputTopic) {
        this.outputTopic = outputTopic;
    }

    public String getListeningTopic() {
        return listeningTopic;
    }

    public void setListeningTopic(String listeningTopic) {
        this.listeningTopic = listeningTopic;
    }

    @Override
    public String toString() {
        return "KafkaProperties{" +
                "ipAddress='" + ipAddress + '\'' +
                ", groupId='" + groupId + '\'' +
                ", outputTopic='" + outputTopic + '\'' +
                ", listeningTopic='" + listeningTopic + '\'' +
                '}';
    }
}
